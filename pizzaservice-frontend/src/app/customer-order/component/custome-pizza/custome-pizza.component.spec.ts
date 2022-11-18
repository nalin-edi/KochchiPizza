import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomePizzaComponent } from './custome-pizza.component';

describe('CustomePizzaComponent', () => {
  let component: CustomePizzaComponent;
  let fixture: ComponentFixture<CustomePizzaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CustomePizzaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustomePizzaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
