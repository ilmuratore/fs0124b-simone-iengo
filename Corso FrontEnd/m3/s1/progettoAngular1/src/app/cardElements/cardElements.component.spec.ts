/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { CardElementsComponent } from './cardElements.component';

describe('CardElementsComponent', () => {
  let component: CardElementsComponent;
  let fixture: ComponentFixture<CardElementsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CardElementsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CardElementsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
