import { BrowserModule } from '@angular/platform-browser';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { ApolloModule, Apollo } from 'apollo-angular';
import { HttpLinkModule, HttpLink } from 'apollo-angular-link-http';
import { InMemoryCache } from 'apollo-cache-inmemory'; 
import { FormsModule } from '@angular/forms';

import { MatSortModule, MatButtonModule, MatToolbarModule, MatCardModule,
    MatInputModule, MatTableModule, MatPaginatorModule, MatIconModule, MatFormFieldModule, MatRadioModule,
    MatDatepickerModule, MatNativeDateModule, MatSelectModule, MatCheckboxModule,
    MatProgressBarModule, MatProgressSpinnerModule, MAT_DATE_LOCALE, MAT_DATE_FORMATS,
    MatTooltipModule, MatListModule, MatDialogModule, MatTabsModule, MatMenuModule, MatExpansionModule
} from '@angular/material';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProcessingComponent } from './processing/processing.component';
import { JobsComponent } from './jobs/jobs.component';
import { ReprintComponent } from './reprint/reprint.component';
import { LogsComponent } from './logs/logs.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { SchedulerComponent } from './scheduler/scheduler.component';
import { DocumentsComponent } from './documents/documents.component';

@NgModule({
  declarations: [
    AppComponent,
    ProcessingComponent,
    JobsComponent,
    ReprintComponent,
    LogsComponent,
    PageNotFoundComponent,
    SchedulerComponent,
    DocumentsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    ApolloModule,
    HttpLinkModule,
    FormsModule, 
    MatToolbarModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatTableModule,
    MatPaginatorModule,
    MatIconModule,
    MatSortModule,
    MatSelectModule,
    MatProgressBarModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatCheckboxModule,
    MatTooltipModule,
    BrowserAnimationsModule,
    MatDatepickerModule,
    MatRadioModule,
    MatListModule,
    MatProgressSpinnerModule,
    MatTabsModule,
    MatMenuModule,
    MatExpansionModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AppModule { 
  constructor (
    apollo: Apollo,
    httpLink: HttpLink
  ) {
    apollo.create({
      link: httpLink.create({uri: 'http://localhost:9000/graphql'}),
      cache: new InMemoryCache()
    })
  }
}
