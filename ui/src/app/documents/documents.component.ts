import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { Sort } from '@angular/material/sort';
import { SelectionModel } from '@angular/cdk/collections';

import { GraphqlService } from '../services/graphql-api.service'; 

@Component({
  selector: 'app-documents',
  templateUrl: './documents.component.html',
  styleUrls: ['./documents.component.scss']
})
export class DocumentsComponent implements OnInit {

  pageNumber = 0;
  pageSize = 10;
  sortBy = "id";
  direction = "asc";
  filter = "";
  resultsLength = 0;

  enabledColumns: string[] = [
    'id', 
    'shipId',
    'docClass',
    'impDate',
    'copies',
    'type',
    'status',
    'priority',
    'outputType',
    'orderInShipment',
    'docUsage'
  ];

  columns = new SelectionModel<any>(true, [
    'id', 
    'shipId', 
    'docClass',
    'type', 
    'outputType', 
    'impDate'
  ]);
  
  dataSource = new MatTableDataSource();
  selection = new SelectionModel<any>(true, []);

  @ViewChild(MatPaginator, {static: false}) paginator: MatPaginator;

  constructor(private backendService: GraphqlService) { }

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
  
  columnsChanged(event) {
    this.columns.clear();
    event.value.forEach((col: any) => this.columns.select(col));
  }
  
  refresh() {
    this.backendService.getDocs(this.pageNumber, this.pageSize, this.sortBy, this.direction, this.filter)
      .subscribe((data) => {
        this.resultsLength = data.getDocs.length;
        this.pageSize = data.getDocs.pageSize;
        this.dataSource = new MatTableDataSource(data.getDocs.docs);  
    });
  }

}
