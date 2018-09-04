package com.hcl.student.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.student.model.StudentRegistrationModel;
import com.hcl.student.service.StudentRegistrationService;

@RestController
@RequestMapping("/student")
public class StudentRegistrationController {
	
	private static final Logger LOG = Logger.getLogger(StudentRegistrationController.class.getName());
	
	@Autowired
	private StudentRegistrationService studentRegistrationService;
	
	@RequestMapping("/newStudentRegistration")
	public String stuRegistration() {
		 String result=null;
		LOG.log(Level.INFO, "Student Registration Process started in Controller Layer");
		StudentRegistrationModel model= new StudentRegistrationModel();
		model.setStrStuName("Vishal Tyagi");
		model.setStrStuFatherName("Dushyant Kumar Tyagi");
		studentRegistrationService.saveStudentRegistration(model);
		
		/*final String uri = "http://teacher-api/teacher/newTeacherRegistration";
	    RestTemplate restTemplate = new RestTemplate();
	   
	    try {
	    	 result = restTemplate.getForObject(uri, String.class);
	    }catch(Exception e) {
	    	e.printStackTrace();
	    	result="Error occurs in calling Rest API of Teacher internally";
	    }*/  
	    LOG.log(Level.INFO, result);
	    System.out.println(result);
		
		return result;
	}
	
		
	@RequestMapping("/getStuDetails")
	public String stuGetData() {
		LOG.log(Level.INFO, "This is Student Deatils API.");
		String result="This is Get function in students details";	     
	    System.out.println(result);	
	    LOG.log(Level.INFO, result);
		return result;
	}

}