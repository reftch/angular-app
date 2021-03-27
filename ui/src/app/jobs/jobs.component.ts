import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { Sort } from '@angular/material/sort';
import { SelectionModel } from '@angular/cdk/collections';

import { Job, GraphqlService } from '../services/graphql-api.service'; 

@Component({
  selector: 'app-jobs',
  templateUrl: './jobs.component.html',
  styleUrls: ['./jobs.component.scss']
})
export class JobsComponent implements OnInit {

  pageNumber = 0;
  pageSize = 10;
  sortBy = "id";
  direction = "asc";
  filter = "";
  resultsLength = 0;
  
  enabledColumns: string[] = [
    'select',
    'id', 
    'processId',
    'jobClassId',
    'authorizationClass',
    'state',
    'numPages',
    'numSheets',
    'numDocuments',
    'creationDate',
    'subClass',
    'jobInfo',
    'jobComment',
    'userField0',
    'userField1',
    'userField2',
    'userField3',
    'userField4',
    'userField5',
    'userField6',
    'userField7',
    'userField8',
    'userField9',
    'workflowId',
    'numDocsPhysInserts',
    'numDocSelecInserts',
    'numDocsCoverSheets',
    'numSheetSelecInserts',
    'numSheetsCoverSheets',
    'numSheetsStartEnd',
    'numSheetsSeparator'
  ];

  columns = new SelectionModel<any>(true, [
    'select', 
    'id', 
    'processId', 
    'jobClassId',
    'state', 
    'numPages', 
    'numSheets', 
    'numDocuments', 
    'creationDate'
  ]);
 
  dataSource = new MatTableDataSource();
  selection = new SelectionModel<any>(true, []);

  @ViewChild(MatPaginator, {static: false}) paginator: MatPaginator;

  constructor(private backendService: GraphqlService) {
  }

  ngOnInit() { 
    this.dataSource.paginator = this.paginator;
    this.refresh();
  }

  onPageChanged(event) {
    // update current page of items
    this.pageNumber = event.pageIndex;
    this.pageSize = event.pageSize;
    this.refresh();
  }

  sortData(sort: Sort) {
    this.sortBy = sort.active;
    this.direction = sort.direction;
    this.refresh();
  }

  applyFilter(filterValue: string) {
    this.pageNumber = 0;
    this.filter = filterValue;
    this.refresh();
  }

  refresh() {
    this.backendService.getJobs(this.pageNumber, this.pageSize, this.sortBy, this.direction, this.filter)
      .subscribe((data) => {
        this.resultsLength = data.getJobs.length;
        this.pageSize = data.getJobs.pageSize;
        this.dataSource = new MatTableDataSource(data.getJobs.jobs);  
    });
  }

  removeJob() {
    this.selection.selected.map(job => {
      this.backendService.removeJob(job.id)
        .subscribe(() => {
          this.refresh(); 
          this.selection.clear();
        });
    });    
  }

  /** Whether the number of selected elements matches the total number of rows. */
  isAllSelected() {
    const numSelected = this.selection.selected.length;
    const numRows = this.dataSource.data.length;
    return numSelected === numRows;
  }

  /** Selects all rows if they are not all selected; otherwise clear selection. */
  masterToggle() {
     this.isAllSelected() ?
         this.selection.clear() :
         this.dataSource.data.forEach(row => this.selection.select(row));
   }

  /** The label for the checkbox on the passed row */
  checkboxLabel(row?: Job): string {
    if (!row) {
      return `${this.isAllSelected() ? 'select' : 'deselect'} all`;
    }
    return `${this.selection.isSelected(row) ? 'deselect' : 'select'} row ${row.id + 1}`;
  }

  columnsChanged(event) {
    this.columns.clear();
    event.value.forEach((col: any) => this.columns.select(col));
  }

}
