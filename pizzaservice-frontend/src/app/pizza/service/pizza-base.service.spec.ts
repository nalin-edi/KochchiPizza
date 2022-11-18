import { TestBed } from '@angular/core/testing';

import { PizzaBaseService } from './pizza-base.service';

describe('PizzaBaseService', () => {
  let service: PizzaBaseService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PizzaBaseService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
