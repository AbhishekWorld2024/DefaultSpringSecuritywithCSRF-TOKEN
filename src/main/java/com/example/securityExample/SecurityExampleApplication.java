package com.example.securityExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication

public class SecurityExampleApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SecurityExampleApplication.class, args);
	}

}
