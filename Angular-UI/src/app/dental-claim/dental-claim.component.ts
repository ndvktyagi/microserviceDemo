import { Component, OnInit } from '@angular/core';
import { SelectItem } from 'primeng/components/common/selectitem';
import { DentalBO } from '../dental-claimBO';
import { RTPlanService } from '../rt-plan.service';
import { Toasts } from '../toasts.service';

interface IDType {
  name: string;
  code: string;
}
@Component({
  selector: 'app-dental-claim',
  templateUrl: './dental-claim.component.html',
  styleUrls: ['./dental-claim.component.css'],
  providers: []
})
export class DentalClaimComponent implements OnInit {

  idtype: SelectItem[];
  saveDentalFormUrl = 'form-api/dental/form/';
  value: Date;
  selectedGender: string;
  dentalBO: DentalBO = new DentalBO();
  message: String;
  tittle: String;

  ngOnInit() {
  }
  constructor(private rtPlanService: RTPlanService, private ToastService: Toasts) {
    this.idtype = [
      { label: 'Select ID Type', value: null },
      { label: 'SSN', value: 'SSN'},
      { label: 'AADHAR CARD', value: 'AADHAR CARD'},
      { label: 'PAN CARD', value: 'PAN CARD'},
      { label: 'VOTER ID CARD', value: 'VOTER ID CARD'},
      { label: 'DRIVING LICENCE CARD', value: 'DRIVING LICENCE CARD'},

    ]
  }

  save() {
    //this.dentalBO.dtEmployeeDateOfBirth=null;
    //this.dentalBO.strEmployeeIDType=null;
    this.rtPlanService.glpost(this.dentalBO, this.saveDentalFormUrl).subscribe((result: any) => {
      if (result !== null) {
        this.message = result.messageValue;
        this.tittle = 'Hi';
        this.ToastService.showSuccess(this.tittle, this.message);
        this.clear();
      }
    });
  }


  clear() {
    this.dentalBO.strPatientName = "";
    this.dentalBO.strPatientGender = "";
    this.dentalBO.strPatientRelationship = "";
    this.dentalBO.dtPatientDateOfBirth = null;
    this.dentalBO.strEmployeeName = "";
    this.dentalBO.dtEmployeeDateOfBirth = null;
    this.dentalBO.strEmployeeIDType = "";
    this.dentalBO.strEmployeeIDNumber = "";
    this.dentalBO.strEmployeeEmailId = "";
    this.dentalBO.lngEmployeeMobileNo = null;
    this.dentalBO.strEmployeeCurrentAdd1 = "";
    this.dentalBO.strEmployeeCurrentAdd2 = "";
    this.dentalBO.strEmployeeCurrentState = "";
    this.dentalBO.lngEmployeeCurrentPinCode = null;
    this.dentalBO.strEmployeePerAdd1 = "";
    this.dentalBO.strEmployeePerAdd2 = "";
    this.dentalBO.strEmployeePerState = "";
    this.dentalBO.lngEmployeePerPinCode = null;
  }
}

