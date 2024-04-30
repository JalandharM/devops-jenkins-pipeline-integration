package com.demo.devopsjenkinspipelineintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsJenkinsPipelineIntegrationApplication {

	@GetMapping("/message")
	public String message(){
		return "Welcome to Devops Jenkins Pipeline Integration!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsJenkinsPipelineIntegrationApplication.class, args);
	}

}
