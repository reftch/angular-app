import { TestBed } from '@angular/core/testing';

import { GraphqlService } from './graphql-api.service';

describe('GraphqlServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: GraphqlService = TestBed.get(GraphqlService);
    expect(service).toBeTruthy();
  });
});
