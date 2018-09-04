import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { StudentRegComponent } from './student-reg/student-reg.component';
import { TeacherRegComponent } from './teacher-reg/teacher-reg.component';
import { HomePageComponent } from './home-page/home-page.component';
import { AppRoutingModule } from './/app-routing.module';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AccordionModule } from 'primeng/accordion';     //accordion and accordion tab
import { ButtonModule } from 'primeng/button';
import { MenubarModule } from 'primeng/menubar';
import { DropdownModule } from 'primeng/dropdown';
import {CalendarModule} from 'primeng/calendar';
import {CheckboxModule} from 'primeng/checkbox';
import {RadioButtonModule} from 'primeng/radiobutton';



@NgModule({
  declarations: [
    AppComponent,
    StudentRegComponent,
    TeacherRegComponent,
    HomePageComponent,
    HeaderComponent,
    FooterComponent,
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
    RadioButtonModule    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
  
 }

