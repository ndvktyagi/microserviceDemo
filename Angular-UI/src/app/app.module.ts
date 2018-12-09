import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import {PasswordModule} from 'primeng/password';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import { AppRoutingModule } from './app-routing.module';
import { MenuBarComponent } from './menu-bar/menu-bar.component';
import { FooterComponent } from './footer/footer.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AccordionModule } from 'primeng/accordion';     //accordion and accordion tab
import { ButtonModule } from 'primeng/button';
import { MenubarModule } from 'primeng/menubar';
import { DropdownModule } from 'primeng/dropdown';
import { CalendarModule } from 'primeng/calendar';
import { CheckboxModule } from 'primeng/checkbox';
import { RadioButtonModule } from 'primeng/radiobutton';
import { LoginComponent } from './login/login.component';
import { InputTextModule } from 'primeng/inputtext';
import { HeaderComponent } from './header/header.component';
import { LogoutComponent } from './logout/logout.component';
import { ScrollPanelModule } from 'primeng/scrollpanel';
import { RegisterComponent } from './register/register.component';
import { DentalClaimComponent } from './dental-claim/dental-claim.component';
import { AccidentalClaimComponent } from './accidental-claim/accidental-claim.component';
import { CommonModule } from '@angular/common';
import { ToastrModule } from 'ngx-toastr';
import { DentalClaimViewComponent } from './dental-claim-view/dental-claim-view.component';
import {TableModule} from 'primeng/table';
import {DialogModule} from 'primeng/dialog';
import { RTPlanService } from '../app/rt-plan.service';
import { Toasts } from '../app/toasts.service';
import {FieldsetModule} from 'primeng/fieldset';
import { DashboardComponent } from './dashboard/dashboard.component';
import { CreatePlanComponent } from './create-plan/create-plan.component';
import { ViewPlanComponent } from './view-plan/view-plan.component';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    MenuBarComponent,
    FooterComponent,
    LoginComponent,
    HeaderComponent,
    LogoutComponent,
    RegisterComponent,
    DentalClaimComponent,
    AccidentalClaimComponent,
    DentalClaimViewComponent,
    DashboardComponent,
    CreatePlanComponent,
    ViewPlanComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AccordionModule,
    ButtonModule,
    MenubarModule,
    AppRoutingModule,
    DropdownModule,
    FormsModule,
    CalendarModule,
    CheckboxModule,
    RadioButtonModule,
    ReactiveFormsModule,
    HttpClientModule,
    InputTextModule,
    ScrollPanelModule,
    CommonModule,
    ToastrModule.forRoot(),
    TableModule,
    DialogModule,
    FieldsetModule,
    PasswordModule

  ],
  providers: [RTPlanService, Toasts],
  bootstrap: [AppComponent]
})
export class AppModule {

}

