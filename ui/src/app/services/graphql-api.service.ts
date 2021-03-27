import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';
import { Apollo } from 'apollo-angular';

import gql from 'graphql-tag';

export type Job = {
  id: number;
  processId: string;
  jobClassId: string;
  state: number;
  numPages: number;
  numSheets: number;
  numDocuments: number;
  creationDate: Date;
  subClass: string;
  jobInfo: string;
  jobComment: string;
  userField0: string;
  userField1: string;
  userField2: string;
  userField3: string;
  userField4: string;
  userField5: string;
  userField6: string;
  userField7: string;
  userField8: string;
  userField9: string;
  workflowId: string;
  numDocsPhysInserts: number;
  numDocSelecInserts: number;
  numDocsCoverSheets: number;
  numSheetSelecInserts: number;
  numSheetsCoverSheets: number;
  numSheetsStartEnd: number;
  numSheetsSeparator: number;
}

const getJobs = gql`
  query Job($offset: Int, $limit: Int, $sortBy: String, $direction: String, $filter: String) {
    getJobs(pageNumber: $offset, pageSize: $limit, sortBy: $sortBy, direction: $direction, filter: $filter) {
      length,
      pageSize,
      jobs {
        id,
        processId,
        jobClassId,
        authorizationClass,
        state,
        numPages,
        numSheets,
        numDocuments,
        creationDate,
        subClass,
        jobInfo,
        jobComment,
        userField0,
        userField1,
        userField2,
        userField3,
        userField4,
        userField5,
        userField6,
        userField7,
        userField8,
        userField9,
        workflowId,
        numDocsPhysInserts,
        numDocSelecInserts,
        numDocsCoverSheets,
        numSheetSelecInserts,
        numSheetsCoverSheets,
        numSheetsStartEnd,
        numSheetsSeparator
      }
    }
  }
`;

const removeJob = gql`
  mutation submitRepository($id: Int) {
    deleteJob(id: $id) {
      id
    },
  }
`;

const getDocs = gql`
  query Doc($offset: Int, $limit: Int, $sortBy: String, $direction: String, $filter: String) {
    getDocs(pageNumber: $offset, pageSize: $limit, sortBy: $sortBy, direction: $direction, filter: $filter) {
      length,
      pageSize,
      docs {
        id,
        shipId,
        docClass,
        impDate,
        copies,
        type,
        status,
        priority,
        outputType,
        orderInShipment,
        docUsage
      }
    }
  }
`;

@Injectable({
  providedIn: 'root'
})
export class GraphqlService {

  constructor(private apollo: Apollo) {
  }

  public getJobs(offset: number, limit: number, sortBy: string, direction: string, filter: string): Observable<any> {
    return this.getObservableData(getJobs, offset, limit, sortBy, direction, filter);
  }

  public getDocs(offset: number, limit: number, sortBy: string, direction: string, filter: string): Observable<any> {
    return this.getObservableData(getDocs, offset, limit, sortBy, direction, filter);
  }

  public getObservableData(queryStr, offset, limit, sortBy, direction, filter): Observable<any> {
    var subject = new Subject<any>();
    this.apollo.query<any>({
      query: queryStr,
      fetchPolicy: 'network-only',
      variables: {
        offset: offset,
        limit: limit,
        sortBy: sortBy,
        direction: direction,
        filter: filter
      }
    }).subscribe(({ data }) => {
      subject.next(data);
    },(error) => {
      console.log('there was an error sending the query', error);
    });
    return subject.asObservable();
  }

  public removeJob(id: number): Observable<number> {
    var subject = new Subject<number>();
    this.apollo.mutate<any>({
      mutation: removeJob,
      variables: {
        id: id
      },
      }).subscribe(() => {
      subject.next(id);
    },(error) => {
      console.log('there was an error sending the query', error);
    });  
    return subject.asObservable();
  }

}
