import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReadymadePizzaComponent } from './readymade-pizza.component';

describe('ReadymadePizzaComponent', () => {
  let component: ReadymadePizzaComponent;
  let fixture: ComponentFixture<ReadymadePizzaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReadymadePizzaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ReadymadePizzaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
