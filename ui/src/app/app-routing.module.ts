import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { Routes, RouterModule } from '@angular/router';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ProcessingComponent } from './processing/processing.component';
import { SchedulerComponent } from './scheduler/scheduler.component';
import { JobsComponent } from './jobs/jobs.component';
import { DocumentsComponent } from './documents/documents.component';
import { ReprintComponent } from './reprint/reprint.component';
import { LogsComponent } from './logs/logs.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

const routes: Routes = [
  { path: 'processing', component: ProcessingComponent, data: {animation: 'processingAnimation' }  },
  { path: 'jobs', component: JobsComponent, data: {animation: 'jobAnimation' } },
  { path: 'documents', component: DocumentsComponent, data: {animation: 'docAnimation' } },
  { path: 'scheduler', component: SchedulerComponent, data: {animation: 'scheduleAnimation' } },
  { path: 'reprint', component: ReprintComponent, data: {animation: 'reprintAnimation' } },
  { path: 'logs', component: LogsComponent, data: {animation: 'logsAnimation' } },
  { path: '', redirectTo: '/jobs', pathMatch: 'full' },
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    RouterModule.forRoot(routes,{ enableTracing: true }),
    NgbModule
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
