import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/components/common/menuitem';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor() { }

  title = 'School Management System';
  items: MenuItem[];

  ngOnInit() {
    this.items = [
      {
        label: 'Administrator',
        items: [{
          label: 'Course Master',
          icon: 'pi pi-fw pi-plus',
          items: [
            { label: 'HSC' },
            { label: 'SSC' },
            { label: 'UG Course' },
            { label: 'PG Course' },
            { label: 'Reseach' }
          ]
        },
        { label: 'Fee Master' },
        { label: 'Libarary Master' },
        { label: 'Stationary Master' },
        { label: 'Stationary Master' },
        { label: 'Staff Master' }
        ]
      },
      {
        label: 'Student',
        icon: 'pi pi-fw pi-pencil',
        items: [
          { label: 'Online Registration',"routerLink":"/app-student-reg", icon: 'pi pi-fw pi-trash' },
          { label: 'Registration Status', icon: 'pi pi-fw pi-refresh' },
          { label: 'Result', icon: 'pi pi-fw pi-refresh' },
          { label: 'Fee Stucture', icon: 'pi pi-fw pi-refresh' }
        ]
      },{
        label: 'Teacher',
        icon: 'pi pi-fw pi-pencil',
        items: [
          { label: 'Assignment Creation',"routerLink":"/app-teacher-reg", icon: 'pi pi-fw pi-trash' },
          { label: 'Test Paper Creation', icon: 'pi pi-fw pi-refresh' },
          { label: 'Test Mapping ', icon: 'pi pi-fw pi-refresh' },
          { label: 'Test Result Correction', icon: 'pi pi-fw pi-refresh' }
        ]
      }
    ];
  }

}
