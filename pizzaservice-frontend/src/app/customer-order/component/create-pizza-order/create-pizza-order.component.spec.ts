import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatePizzaOrderComponent } from './create-pizza-order.component';

describe('CreatePizzaOrderComponent', () => {
  let component: CreatePizzaOrderComponent;
  let fixture: ComponentFixture<CreatePizzaOrderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreatePizzaOrderComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreatePizzaOrderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
