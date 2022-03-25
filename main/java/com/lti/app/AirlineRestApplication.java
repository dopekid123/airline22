package com.lti.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirlineRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineRestApplication.class, args);
		System.out.println("Application Started");
	}

}
