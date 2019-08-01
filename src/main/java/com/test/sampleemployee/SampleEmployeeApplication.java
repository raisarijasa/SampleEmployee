package com.test.sampleemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SampleEmployeeApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SampleEmployeeApplication.class, args);
	}

}
