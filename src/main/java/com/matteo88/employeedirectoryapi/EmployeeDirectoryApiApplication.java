package com.matteo88.employeedirectoryapi;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class EmployeeDirectoryApiApplication {

	public static void main(String[] args) {
		//Starts the application
		SpringApplication.run(EmployeeDirectoryApiApplication.class, args);
	}

}
