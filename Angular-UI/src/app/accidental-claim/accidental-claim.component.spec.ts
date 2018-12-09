import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AccidentalClaimComponent } from './accidental-claim.component';

describe('AccidentalClaimComponent', () => {
  let component: AccidentalClaimComponent;
  let fixture: ComponentFixture<AccidentalClaimComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AccidentalClaimComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AccidentalClaimComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
