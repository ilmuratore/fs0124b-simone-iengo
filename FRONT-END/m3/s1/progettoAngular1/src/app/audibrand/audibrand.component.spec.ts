/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { AudibrandComponent } from './audibrand.component';

describe('AudibrandComponent', () => {
  let component: AudibrandComponent;
  let fixture: ComponentFixture<AudibrandComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AudibrandComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AudibrandComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
