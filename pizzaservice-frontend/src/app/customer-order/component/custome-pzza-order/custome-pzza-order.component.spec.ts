import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomePzzaOrderComponent } from './custome-pzza-order.component';

describe('CustomePzzaOrderComponent', () => {
  let component: CustomePzzaOrderComponent;
  let fixture: ComponentFixture<CustomePzzaOrderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CustomePzzaOrderComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustomePzzaOrderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
