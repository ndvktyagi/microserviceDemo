package com.hcl.planformapi.controller;

import java.util.List;
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

import com.hcl.planformapi.model.Message;
import com.hcl.planformapi.model.PlanFormApiModel;
import com.hcl.planformapi.service.PlanFormApiService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/plan")
public class PlanFormApiController {

	private static final Logger LOG = Logger.getLogger(PlanFormApiController.class.getName());

	@Autowired
	private PlanFormApiService planFormApiSevice;

	@RequestMapping(value = "/savePlan", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> PlanRegistration(@RequestBody PlanFormApiModel model) {
		Message message = new Message();
		String result = null;
		LOG.log(Level.INFO, "Plan From Application Process started in Controller Layer");
		try {
			planFormApiSevice.savePlanForm(model);
			message.setMessageCode("SUCCESS");
			message.setMessageValue("Plan Data has been saved succussfully for Plan Form");
		} catch (Exception e) {
			e.printStackTrace();
			message.setMessageCode("ERROR");
			message.setMessageValue("Plan Data has not been saved succussfully for Plan Form");
		}
		LOG.log(Level.INFO, result);
		System.out.println(result);

		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/updatePlan", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> PlanRegistrationUpdate(@RequestBody PlanFormApiModel model) {
		Message message = new Message();
		String result = null;
		LOG.log(Level.INFO, "Plan From Application Process started in Controller Layer");
		try {
			planFormApiSevice.savePlanForm(model);
			message.setMessageCode("SUCCESS");
			message.setMessageValue("Plan Data has been updated succussfully for Plan Form");
		} catch (Exception e) {
			e.printStackTrace();
			message.setMessageCode("ERROR");
			message.setMessageValue("Plan Data has not been updated succussfully for Plan Form");
		}
		LOG.log(Level.INFO, result);
		System.out.println(result);

		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deletePlan", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> PlanRegistrationDelete(@RequestBody PlanFormApiModel model) {
		Message message = new Message();
		String result = null;
		LOG.log(Level.INFO, "Plan From Application Process started in Controller Layer");
		try {
			planFormApiSevice.savePlanForm(model);
			message.setMessageCode("SUCCESS");
			message.setMessageValue("Plan Data has been deleted succussfully for Plan Form");
		} catch (Exception e) {
			e.printStackTrace();
			message.setMessageCode("ERROR");
			message.setMessageValue("Plan Data has not been deleted succussfully for Plan Form");
		}
		LOG.log(Level.INFO, result);
		System.out.println(result);

		return new ResponseEntity<>(message, HttpStatus.OK);
	}

	@RequestMapping(value = "/getplantAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getPlanFormAllData() {
		List<PlanFormApiModel> planFormAllData = null;
		LOG.log(Level.INFO, "Plan data fetch calling started in Controller Layer");
		try {
			planFormAllData = planFormApiSevice.getAllPlanDtls();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(planFormAllData, HttpStatus.OK);
	}

}