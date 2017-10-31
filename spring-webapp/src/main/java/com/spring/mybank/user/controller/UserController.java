package com.spring.mybank.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mybank.annotation.LogExecutionTime;
import com.spring.mybank.user.model.User;
import com.spring.mybank.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "create", method = RequestMethod.POST)
	@LogExecutionTime
	public ResponseEntity<User> createUser(@RequestBody User user) {
		log.info("***** create user called *****");
		return new ResponseEntity<User>(
				userService.createUser(User.builder().first_name(user.getFirst_name()).last_name(user.getLast_name())
						.user_name(user.getUser_name()).password(user.getPassword())
						.date_of_birth(user.getDate_of_birth()).company(user.getCompany()).build()),
				HttpStatus.OK);
	}
	
	@RequestMapping(value = "getAllUsers", method = RequestMethod.GET)
	@LogExecutionTime
	public List<String> getAllUsers() {
		log.info("***** Get all users called *****");
		List<String> userList = new ArrayList<String>();
		userList.add("Naveen");
		userList.add("Balaji");
		return userList;
	}
}
