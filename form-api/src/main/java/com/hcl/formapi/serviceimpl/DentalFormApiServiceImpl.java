package com.hcl.formapi.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.formapi.entity.bean.DentalFormApiEntity;
import com.hcl.formapi.model.DentalFormApiModel;
import com.hcl.formapi.repository.DentalFormApiRepository;
import com.hcl.formapi.service.DentalFormApiService;

@Service
public class DentalFormApiServiceImpl implements DentalFormApiService {

	@Autowired
	private DentalFormApiRepository dentalFormApiRepository;

	@Override
	public List<DentalFormApiModel> getAllPatientDtls() {
		List<DentalFormApiEntity> entityList= (List<DentalFormApiEntity>) dentalFormApiRepository.findAll();
		List<DentalFormApiModel> modelList= new ArrayList<>();
		for(DentalFormApiEntity entity:entityList) {
			DentalFormApiModel model = new DentalFormApiModel();
			BeanUtils.copyProperties(entity, model);
			modelList.add(model);
		}
		return modelList;
		
	}

	@Override
	public void savePatientDentalForm(DentalFormApiModel model) {
		DentalFormApiEntity entity=new DentalFormApiEntity();
		BeanUtils.copyProperties(model, entity);
		dentalFormApiRepository.save(entity);
	}
	
	
	
}