import { TestBed } from '@angular/core/testing';

import { ReadymadePizzaService } from './readymade-pizza.service';

describe('ReadymadePizzaService', () => {
  let service: ReadymadePizzaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ReadymadePizzaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
