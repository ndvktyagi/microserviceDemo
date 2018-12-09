import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DentalClaimViewComponent } from './dental-claim-view.component';

describe('DentalClaimViewComponent', () => {
  let component: DentalClaimViewComponent;
  let fixture: ComponentFixture<DentalClaimViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DentalClaimViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DentalClaimViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
