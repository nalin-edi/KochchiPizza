import { TestBed } from '@angular/core/testing';

import { PizzaToppingService } from './pizza-topping.service';

describe('PizzaToppingService', () => {
  let service: PizzaToppingService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PizzaToppingService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
