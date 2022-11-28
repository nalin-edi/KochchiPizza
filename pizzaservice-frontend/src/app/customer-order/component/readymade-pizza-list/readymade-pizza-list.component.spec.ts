import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReadymadePizzaListComponent } from './readymade-pizza-list.component';

describe('ReadymadePizzaListComponent', () => {
  let component: ReadymadePizzaListComponent;
  let fixture: ComponentFixture<ReadymadePizzaListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReadymadePizzaListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ReadymadePizzaListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
