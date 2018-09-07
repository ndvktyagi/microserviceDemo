package com.hcl.formapi.service;

import java.util.List;

import com.hcl.formapi.entity.bean.DentalFormApiEntity;
import com.hcl.formapi.model.DentalFormApiModel;

public interface DentalFormApiService {

	public List<DentalFormApiEntity> getAllPatientDtls();
	public void savePatientDentalForm(DentalFormApiModel patientDentalForm);

}
