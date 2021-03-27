
export type Job = {
    id: number;
    processId: string;
    jobClassId: string;
    state: number;
    numPages: number;
    numSheets: number;
    numDocuments: number;
    creationDate: Date;
}        

//export type Query = {
    //getJobs(pageNumber: number, pageSize: number): Job[];
//    getJobs(pageNumber: number, pageSize: number, sortBy: string, direction: string): Job[];
//}