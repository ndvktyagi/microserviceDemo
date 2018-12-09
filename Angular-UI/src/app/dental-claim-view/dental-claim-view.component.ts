import { Component, OnInit } from '@angular/core';
import { RTPlanService } from '../rt-plan.service';
import { Toasts } from '../toasts.service';
import { DentalBO } from '../dental-claimBO';
@Component({
    selector: 'app-dental-claim-view',
    templateUrl: './dental-claim-view.component.html',
    styleUrls: ['./dental-claim-view.component.css']
})
export class DentalClaimViewComponent implements OnInit {
    displayDialog: boolean;
    dentalData: DentalBO;

    selecteddentalData: DentalBO;

    newDentalData: boolean;

    dentalDatas: DentalBO[];

    cols: any[];

    viewDentalUrl = 'form-api/dental/getpatientDentalAll/';

    message: String;

    tittle: String;

    constructor(private rtplanService: RTPlanService, private ToastService: Toasts) {
    }

    ngOnInit() {
        this.rtplanService.get(this.viewDentalUrl).subscribe((result: any) => {
            if (result !== null) {
                this.dentalDatas = result
            }
        });
        this.cols = [
            { field: 'strPatientId', header: 'Patient ID' },
            { field: 'strPatientName', header: 'Patient Name' },
            { field: 'strPatientGender', header: 'Patient Gender' },
            { field: 'strPatientRelationship', header: 'Patinet Relation' },
            { field: 'dtPatientDateOfBirth', header: 'Patient DOB' },
            { field: 'strEmployeeName', header: 'Employee Name' },
            //{ field: 'dtEmployeeDateOfBirth', header: 'Employee DOB' },
            { field: 'strEmployeeIDType', header: 'Employee ID Type' },
            { field: 'strEmployeeIDNumber', header: 'Employee ID Number' },
            { field: 'strEmployeeEmailId', header: 'Employee Email ID' },
            { field: 'lngEmployeeMobileNo', header: 'Employee Mobile Number' },
            //{ field: 'strEmployeeCurrentAdd1', header: 'Employee Current Address' },
            //{ field: 'strEmployeePerAdd1', header: 'Employee Permanent Address' },
        ];
    }
    checkDate(value: any) {
        if (value == 'dtPatientDateOfBirth' || value == 'dtEmployeeDateOfBirth') {
            return true;
        }
        else {
            return false;
        }

    }
    /*showDialogToAdd() {
        this.newCar = true;
        this.car = {};
        this.displayDialog = true;
    }*/

    save() {
        let dentalDatas = [...this.dentalDatas];
        if (this.dentalDatas)
            dentalDatas.push(this.dentalData);
        else
            dentalDatas[this.dentalDatas.indexOf(this.selecteddentalData)] = this.dentalData;

        this.dentalDatas = dentalDatas;
        this.dentalData = null;
        this.displayDialog = false;
    }

    delete() {
        let index = this.dentalDatas.indexOf(this.selecteddentalData);
        this.dentalDatas = this.dentalDatas.filter((val, i) => i != index);
        this.dentalData = null;
        this.displayDialog = false;
    }

    onRowSelect(event) {
        this.newDentalData = false;
        this.dentalData = this.cloneDentalData(event.data);
        this.displayDialog = true;
    }

    cloneDentalData(c: DentalBO): DentalBO {
        let dentalData;
        for (let prop in c) {
            dentalData[prop] = c[prop];
        }
        return dentalData;
    }

}
