package com.hcl.formapi.serviceimpl;

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
	public List<DentalFormApiEntity> getAllPatientDtls() {
		return (List<DentalFormApiEntity>) dentalFormApiRepository.findAll();
	}

	@Override
	public void savePatientDentalForm(DentalFormApiModel model) {
		DentalFormApiEntity entity=new DentalFormApiEntity();
		BeanUtils.copyProperties(model, entity);
		dentalFormApiRepository.save(entity);
	}
	
	
	
}