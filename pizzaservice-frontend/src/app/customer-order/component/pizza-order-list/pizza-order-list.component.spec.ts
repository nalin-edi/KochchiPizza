import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PizzaOrderListComponent } from './pizza-order-list.component';

describe('PizzaOrderListComponent', () => {
  let component: PizzaOrderListComponent;
  let fixture: ComponentFixture<PizzaOrderListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PizzaOrderListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PizzaOrderListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
