package com.spring.mybank.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mybank.user.model.User;
import com.spring.mybank.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="create", method = RequestMethod.POST)
	public ResponseEntity<User> createUser(@RequestBody User user) {
		log.info("***** create user called *****");
		ResponseEntity<User> responseEntity = new ResponseEntity<User>(userService.createUser(user), HttpStatus.OK);
		return responseEntity;
	}

}
