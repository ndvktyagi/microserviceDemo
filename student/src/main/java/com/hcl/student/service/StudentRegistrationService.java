package com.hcl.student.service;

import java.util.List;

import com.hcl.student.entity.bean.StudentRegistrationEntity;
import com.hcl.student.model.StudentRegistrationModel;

public interface StudentRegistrationService {

	public List<StudentRegistrationEntity> getAllStudent();
	public void saveStudentRegistration(StudentRegistrationModel studentRegstration);

}
