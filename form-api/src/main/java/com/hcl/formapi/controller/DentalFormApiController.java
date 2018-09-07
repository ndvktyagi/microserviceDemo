package com.hcl.formapi.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.formapi.model.Message;
import com.hcl.formapi.model.DentalFormApiModel;
import com.hcl.formapi.service.DentalFormApiService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/dental")
public class DentalFormApiController {
	
	private static final Logger LOG = Logger.getLogger(DentalFormApiController.class.getName());
	
	@Autowired
	private DentalFormApiService dentalFormApiSevice;
	
	@RequestMapping(value="/form",method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> stuRegistration( @RequestBody DentalFormApiModel model ) {
		Message message=new Message(); 
		String result=null;
		LOG.log(Level.INFO, "Dental From Application Process started in Controller Layer");
		try {
			dentalFormApiSevice.savePatientDentalForm(model);
			message.setMessageCode("SUCCESS");
			message.setMessageValue("Patient Data has been saved succussfully for Dental Form");
		}catch(Exception e) {
	    	e.printStackTrace();
	    	message.setMessageCode("ERROR");
			message.setMessageValue("Patient Data has not been saved succussfully for Dental");
	    }
		
		
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
	    
		return new ResponseEntity<>(message,HttpStatus.OK);
	}
	
}