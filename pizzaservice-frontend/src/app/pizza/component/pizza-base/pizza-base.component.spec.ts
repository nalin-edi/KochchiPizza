import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PizzaBaseComponent } from './pizza-base.component';

describe('PizzaBaseComponent', () => {
  let component: PizzaBaseComponent;
  let fixture: ComponentFixture<PizzaBaseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PizzaBaseComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PizzaBaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
