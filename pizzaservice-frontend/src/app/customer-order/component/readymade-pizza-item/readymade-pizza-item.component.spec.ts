import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReadymadePizzaItemComponent } from './readymade-pizza-item.component';

describe('ReadymadePizzaItemComponent', () => {
  let component: ReadymadePizzaItemComponent;
  let fixture: ComponentFixture<ReadymadePizzaItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReadymadePizzaItemComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ReadymadePizzaItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
