package com.spring.mybank.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class WebConfiguration {

	private static final String CONSOLE = "/console/*";
	
	@Bean
	ServletRegistrationBean h2ServletRegistrationBean() {
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
		registrationBean.addUrlMappings(CONSOLE);
		return registrationBean;
	}
}
