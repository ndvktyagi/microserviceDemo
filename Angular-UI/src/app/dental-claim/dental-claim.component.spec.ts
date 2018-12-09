import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DentalClaimComponent } from './dental-claim.component';

describe('DentalClaimComponent', () => {
  let component: DentalClaimComponent;
  let fixture: ComponentFixture<DentalClaimComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DentalClaimComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DentalClaimComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
