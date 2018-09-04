package com.hcl.teacher;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/teacher")
public class TeacherApplication {
	
	private static final Logger LOG = Logger.getLogger(TeacherApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(TeacherApplication.class, args);
	}
	
	@RequestMapping("/newTeacherRegistration")
	public String stuRegistration() {
		LOG.log(Level.INFO, "This is Teacher Registration API.");
		return "Teacher Registration has been succussfully.";
	}
}
