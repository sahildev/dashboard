package com.spring.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class DashboardApplication extends SpringBootServletInitializer  {
	
	private static Class applicationClass = DashboardApplication.class;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(applicationClass);
	}

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}
}
