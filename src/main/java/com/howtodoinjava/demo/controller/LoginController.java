package com.howtodoinjava.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.LoginDetails;
import com.howtodoinjava.demo.service.UserService;

@RestController
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/loginCheck", method=RequestMethod.POST)
	public void checkLoginDetails(@RequestBody LoginDetails loginDetails) {
		userService.verifyUserDetails();
		
	}

}
