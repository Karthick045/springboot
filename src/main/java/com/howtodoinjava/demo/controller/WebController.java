package com.howtodoinjava.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class WebController {
	
    @GetMapping(value="/karthik")
    public String homepage(){
        return "index";
    }
}