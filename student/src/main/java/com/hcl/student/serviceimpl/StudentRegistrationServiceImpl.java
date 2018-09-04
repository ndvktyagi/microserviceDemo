package com.hcl.student.serviceimpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.student.entity.bean.StudentRegistrationEntity;
import com.hcl.student.model.StudentRegistrationModel;
import com.hcl.student.repository.StudentRegistrationRepository;
import com.hcl.student.service.StudentRegistrationService;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {

	@Autowired
	private StudentRegistrationRepository studentRegistrationRepository;

	@Override
	public List<StudentRegistrationEntity> getAllStudent() {
		return (List<StudentRegistrationEntity>) studentRegistrationRepository.findAll();
	}

	@Override
	public void saveStudentRegistration(StudentRegistrationModel model) {
		StudentRegistrationEntity entity=new StudentRegistrationEntity();
		BeanUtils.copyProperties(model, entity);
		studentRegistrationRepository.save(entity);
	}
}