import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PizzaCartItemComponent } from './pizza-cart-item.component';

describe('PizzaCartItemComponent', () => {
  let component: PizzaCartItemComponent;
  let fixture: ComponentFixture<PizzaCartItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PizzaCartItemComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PizzaCartItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
