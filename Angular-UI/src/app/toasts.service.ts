import { Injectable } from '@angular/core';
import { ToastrService } from 'ngx-toastr';

@Injectable()
export class Toasts {
    constructor(private toastrService: ToastrService) {}
 
  showSuccess(tittle,message) {
    this.toastrService.success(message, tittle);
  }

  showError(tittle,message) {
    this.toastrService.error(message, tittle);
  }

  showInfo(tittle,message) {
    this.toastrService.info(message, tittle);
  }

  showWarning(tittle,message) {
   this.toastrService.warning(message, tittle);
  }
}
