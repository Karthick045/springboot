package com.howtodoinjava.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoCompleteController {
	
	
	@RequestMapping(value="/autoComplete", method=RequestMethod.POST)
	public void autoComplete(@RequestBody String searchKeyWord) {
	System.out.println(searchKeyWord);		
	}

}
