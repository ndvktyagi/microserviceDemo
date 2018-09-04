import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { StudentRegComponent }   from './student-reg/student-reg.component';
import { TeacherRegComponent }      from './teacher-reg/teacher-reg.component';
import { AppComponent } from './app.component';


const routes: Routes = [
  { path: '', redirectTo: '/app-student-reg', pathMatch: 'full' },
  { path: 'app', component: StudentRegComponent },
  { path: 'app-student-reg', component: StudentRegComponent },
  { path: 'app-teacher-reg', component: TeacherRegComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})

export class AppRoutingModule {}