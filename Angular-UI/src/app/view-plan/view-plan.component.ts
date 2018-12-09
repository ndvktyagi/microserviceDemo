import { Component, OnInit } from '@angular/core';
import { RTPlanService } from '../rt-plan.service';
import { Toasts } from '../toasts.service';
import { PlanBO } from '../planBO';
import { SelectItem } from 'primeng/components/common/selectitem';
@Component({
    selector: 'app-view-plan',
    templateUrl: './view-plan.component.html',
    styleUrls: ['./view-plan.component.css']
})
export class ViewPlanComponent implements OnInit {
    cols: any;
    planBO: PlanBO;
    displayDialog: boolean;
    selectedPlanData: PlanBO;
    selected: PlanBO = new PlanBO();
    newPlanData: boolean;
    planDatas: PlanBO = new PlanBO();
    viewPlanUrl = 'plan-api/plan/getplantAll/';
    message: String;
    tittle: String;
    planIdtype : SelectItem[];
    saveplanFormUrl = 'plan-api/plan/savePlan';

    constructor(private rtplanService: RTPlanService, private ToastService: Toasts) {
    }

    ngOnInit() {
        this.cols = [
            { field: 'dtplanfromDate', header: 'From Date' },
            { field: 'dtplantoDate', header: 'To Date' },
            { field: 'strplanName', header: 'Plan Name' },
            { field: 'strPlanid', header: 'Plan ID' },
            { field: 'strplanType', header: 'Plan Type' }
        ];
        this.rtplanService.get(this.viewPlanUrl).subscribe((result: any) => {
            if (result !== null) {
                this.planBO = result;
            }
        });
        this.planIdtype = [
            { label: 'Select Plan Type', value: null },
            { label: 'Insurance', value: 'Insurance'},
            { label: 'Health', value: 'Insurance'},
            { label: 'Retirement', value: 'Retirement'},
          ]
        
    }
    checkDate(value: any) {
        if (value == 'dtplanfromDate' || value == 'dtplantoDate') {
            return true;
        }
        else {
            return false;
        }

    }
    save() {
        this.rtplanService.glpost(this.selected, this.saveplanFormUrl).subscribe((result: any) => {
            if (result !== null) {
                this.message = result.messageValue;
                this.tittle = 'Hi';
                this.ToastService.showSuccess(this.tittle, this.message);
                this.displayDialog = false;
            }
          });


       /* let planDatas = [...this.planDatas];
        if (this.planDatas)
            planDatas.push(this.planBO);
        else
            planDatas[this.planDatas.indexOf(this.selectedPlanData)] = this.planBO;
        this.planDatas = planDatas;
        this.planBO = null;*/
        
    }

    /*delete() {
        let index = this.planDatas.indexOf(this.selectedPlanData);
        this.planDatas = this.planDatas.filter((val, i) => i != index);
        this.planBO = null;
        this.displayDialog = false;
    }*/

    onRowSelect(event) {
        this.newPlanData = false;
        this.selectedPlanData = this.clonePlanData(event.data);
        this.displayDialog = true;
    }

    clonePlanData(c: PlanBO): PlanBO {
        for (let prop in c) {
            this.selected[prop] = c[prop];
        }
        return this.selected;
    }
}
