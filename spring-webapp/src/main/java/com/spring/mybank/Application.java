package com.spring.mybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@EnableAutoConfiguration
public class Application {
	public static void main(String[] args) {
		log.info("APPLICATION STARTED RUNNING");
		SpringApplication.run(Application.class, args);
	}
}
