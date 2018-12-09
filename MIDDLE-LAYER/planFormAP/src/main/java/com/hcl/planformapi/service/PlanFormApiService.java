package com.hcl.planformapi.service;

import java.util.List;

import com.hcl.planformapi.model.PlanFormApiModel;

public interface PlanFormApiService {

	public List<PlanFormApiModel> getAllPlanDtls();
	public void savePlanForm(PlanFormApiModel planForm);

}
