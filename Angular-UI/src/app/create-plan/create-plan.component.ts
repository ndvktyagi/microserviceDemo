import { Component, OnInit } from '@angular/core';
import { PlanBO } from '../planBO';
import { SelectItem } from 'primeng/components/common/selectitem';
import { RTPlanService } from '../rt-plan.service';
import { Toasts } from '../toasts.service';

@Component({
  selector: 'app-create-plan',
  templateUrl: './create-plan.component.html',
  styleUrls: ['./create-plan.component.css']
})
export class CreatePlanComponent implements OnInit {

  planBO: PlanBO = new PlanBO();
  planIdtype : SelectItem[];
  message: String;
  tittle: String;
  saveplanFormUrl = 'plan-api/plan/savePlan';
  constructor(private rtPlanService : RTPlanService,private ToastService: Toasts) { }

  ngOnInit() {
    this.planIdtype = [
      { label: 'Select Plan Type', value: null },
      { label: 'Insurance', value: 'Insurance'},
      { label: 'Health', value: 'Insurance'},
      { label: 'Retirement', value: 'Retirement'},
    ]
  }
  save() {
    this.rtPlanService.glpost(this.planBO, this.saveplanFormUrl).subscribe((result: any) => {
      if (result !== null) {
        this.message = result.messageValue;
        this.tittle = 'Hi';
        this.ToastService.showSuccess(this.tittle, this.message);
        this.clear();
      }
    });
  }
  clear() {
    this.planBO.dtplanfromDate = null;
    this.planBO.dtplantoDate = null;
    this.planBO.strPlanid = "";
    this.planBO.strplanType = null;
    this.planBO.strplanName = "";
  }
}
