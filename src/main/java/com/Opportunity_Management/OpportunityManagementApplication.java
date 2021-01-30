package com.Opportunity_Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.Opportunity_Management"})
public class OpportunityManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpportunityManagementApplication.class, args);
	}

}
