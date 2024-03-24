package com.restapi.sai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {
	
	
	@GetMapping("hello")
	public String hello() {
		return "Hello World";
	}

}
