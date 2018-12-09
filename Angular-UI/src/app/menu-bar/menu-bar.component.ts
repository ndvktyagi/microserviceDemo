import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/components/common/menuitem';

@Component({
  selector: 'app-menu-bar',
  templateUrl: './menu-bar.component.html',
  styleUrls: ['./menu-bar.component.css']
})
export class MenuBarComponent implements OnInit {

  constructor() { }

  title = 'School Management System';
  items: MenuItem[];

  ngOnInit() {
    /*this.items = [
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
    ];*/
    this.items = [
      {
        label: 'Home',
        "routerLink":"/dashboard/home",
        //icon: 'pi pi-fw pi-pencil',

      },/*{
      label: 'Plan Type',
     // icon: 'pi pi-fw pi-pencil',
      items: [
        { label: 'Profit Sharing' },
        { label: 'Money Purchase' },
        { label: 'Non Qualified DC '},
        { label: 'Defined Benefit' }
      ]
    },*/
    {
      label: 'Plan',
     // icon: 'pi pi-fw pi-pencil',
      items: [
        { label: 'Create Plan',routerLink:"create-plan",routerLinkActiveOptions:"Active"},
        { label: 'View Plan',routerLink:"view-plan",routerLinkActiveOptions:"Active"},
        //{ label: 'Update Plan'}
      ]
    },
    {
      label: 'Form Type',
      //icon: 'pi pi-fw pi-pencil',
      items: [
        { label: 'Dental Claim',routerLink:"dental-claim",routerLinkActiveOptions:"Active"},
        { label: 'Dental Claim Records',routerLink:"dental-claim-view",routerLinkActiveOptions:"Active" },
        { label: 'Accidental Benifit Claim Form',routerLink:"accidental-claim",routerLinkActiveOptions:"Active"},
        { label: 'Vison Claim Form '},
        { label: 'Group Disability Form' },
        { label: 'Paid Family Leave Form' }
      ]
    }
  ]
  }

}
