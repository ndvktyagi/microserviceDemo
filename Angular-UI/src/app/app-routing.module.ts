import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { DentalClaimComponent } from './dental-claim/dental-claim.component';
import { AccidentalClaimComponent } from './accidental-claim/accidental-claim.component';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomePageComponent } from './home-page/home-page.component';
import { LogoutComponent } from './logout/logout.component';
import { RegisterComponent } from './register/register.component';
import { DentalClaimViewComponent } from './dental-claim-view/dental-claim-view.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import {CreatePlanComponent } from './create-plan/create-plan.component';
import {ViewPlanComponent} from './view-plan/view-plan.component';
const routes: Routes = [

  { path: '', redirectTo: '/login-page', pathMatch: 'full' },
  {
    path: 'dashboard', component: DashboardComponent,
    children: [
      {
        path: 'home',
        component: HomePageComponent,
      },
      {
        path: 'create-plan',
        component: CreatePlanComponent,
      },
      {
        path: 'view-plan',
        component: ViewPlanComponent,
      },
      {
        path: 'dental-claim',
        component: DentalClaimComponent,
      },
      {
        path: 'dental-claim-view',
        component: DentalClaimViewComponent,
      },
      {
        path: 'accidental-claim',
        component: AccidentalClaimComponent,
      }
    ]
  },
  { path: 'register', component: RegisterComponent },
  { path: 'login-page', component: LoginComponent },
  { path: 'logout', component: LogoutComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }