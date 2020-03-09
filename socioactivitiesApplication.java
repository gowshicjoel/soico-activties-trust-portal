package com.iim.socioactivities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
public class socioactivitiesApplication extends SpringBootServletInitializer {
@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(socioactivitiesApplication.class);
}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(socioactivitiesApplication.class, args);
	}

}
