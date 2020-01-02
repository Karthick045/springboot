package com.howtodoinjava.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.howtodoinjava.demo.service.UserService;
import com.howtodoinjava.demo.service.UserServiceImpl;

@Configuration
public class BeanConfig {
	
	@Bean
	public UserService userservice() {
		return new UserServiceImpl();
	}
	
}
