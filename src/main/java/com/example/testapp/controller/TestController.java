package com.example.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public String hello() {
		
		return "Hello!!!";
	}
	
	@RequestMapping(value = "/bye")
	public String sayBye() {
		
		return "Good Bye!!";
	}
}
