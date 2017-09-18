package com.spring.mybank.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class UserController {
	
	@RequestMapping("/create")
	public ResponseEntity<String> createUser() {
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(HttpStatus.OK);
		log.info("***** create user called *****");
		return responseEntity;
	}

}
