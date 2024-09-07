/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { FordbrandComponent } from './fordbrand.component';

describe('FordbrandComponent', () => {
  let component: FordbrandComponent;
  let fixture: ComponentFixture<FordbrandComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FordbrandComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FordbrandComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
