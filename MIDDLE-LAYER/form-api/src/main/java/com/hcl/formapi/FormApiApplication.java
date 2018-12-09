package com.hcl.formapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FormApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormApiApplication.class, args);
	}
}
