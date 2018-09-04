import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TeacherRegComponent } from './teacher-reg.component';

describe('TeacherRegComponent', () => {
  let component: TeacherRegComponent;
  let fixture: ComponentFixture<TeacherRegComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TeacherRegComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TeacherRegComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
