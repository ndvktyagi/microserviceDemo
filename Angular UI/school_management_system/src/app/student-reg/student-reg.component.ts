import { Component, OnInit } from '@angular/core';
import {SelectItem} from 'primeng/components/common/selectitem';


interface City {
  name: string;
  code: string;
}


@Component({
  selector: 'app-student-reg',
  templateUrl: './student-reg.component.html',
  styleUrls: ['./student-reg.component.css']
})
export class StudentRegComponent {

  cities1: SelectItem[];    
  cities2: City[];
  selectedCity1: City;  
  selectedCity2: City;
  value: Date;
  selectedGender: string;

  constructor() {
      //SelectItem API with label-value pairs
      this.cities1 = [
          {label:'Select Course', value:null},
          {label:'HSC', value:{id:1, name: 'HSC', code: 'HSC'}},
          {label:'SSC', value:{id:2, name: 'SSC', code: 'SSC'}},
          {label:'BCA', value:{id:3, name: 'BCA', code: 'BCA'}},
          {label:'B.TECH', value:{id:4, name: 'B.TECH', code: 'M.C.A'}},
          {label:'M.C.A', value:{id:5, name: 'M.C.A', code: 'M.C.A'}}
      ];
      
      //An array of cities
      this.cities2 = [
          {name: 'New York', code: 'NY'},
          {name: 'Rome', code: 'RM'},
          {name: 'London', code: 'LDN'},
          {name: 'Istanbul', code: 'IST'},
          {name: 'Paris', code: 'PRS'}
      ];
  }

}
