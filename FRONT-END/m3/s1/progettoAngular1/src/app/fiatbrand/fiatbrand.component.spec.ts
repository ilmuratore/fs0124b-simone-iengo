/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { FiatbrandComponent } from './fiatbrand.component';

describe('FiatbrandComponent', () => {
  let component: FiatbrandComponent;
  let fixture: ComponentFixture<FiatbrandComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FiatbrandComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FiatbrandComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
