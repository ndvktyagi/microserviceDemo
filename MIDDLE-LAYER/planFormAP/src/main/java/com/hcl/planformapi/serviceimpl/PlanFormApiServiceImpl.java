package com.hcl.planformapi.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.planformapi.entity.bean.PlanFormApiEntity;
import com.hcl.planformapi.model.PlanFormApiModel;
import com.hcl.planformapi.repository.PlanFormApiRepository;
import com.hcl.planformapi.service.PlanFormApiService;

@Service
public class PlanFormApiServiceImpl implements PlanFormApiService {

	@Autowired
	private PlanFormApiRepository planFormApiRepository;

	@Override
	public List<PlanFormApiModel> getAllPlanDtls() {
		List<PlanFormApiEntity> entityList= (List<PlanFormApiEntity>) planFormApiRepository.findAll();
		List<PlanFormApiModel> modelList= new ArrayList<>();
		for(PlanFormApiEntity entity:entityList) {
			PlanFormApiModel model = new PlanFormApiModel();
			BeanUtils.copyProperties(entity, model);
			modelList.add(model);
		}
		return modelList;
		
	}

	@Override
	public void savePlanForm(PlanFormApiModel model) {
		PlanFormApiEntity entity=new PlanFormApiEntity();
		BeanUtils.copyProperties(model, entity);
		planFormApiRepository.save(entity);
	}
	
	
	
}