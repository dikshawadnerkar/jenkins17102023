package com.example.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public String hello() {
		
		return "Welcome to Jenkins!!";
	}
	
	@RequestMapping("/bye")
	public String sayBye() {
		
		return "Good Bye!!";
	}
	
	@RequestMapping("/hi")
	public String sayHi() {
		
		return "Hiii Everyone!!";
	}
	
	@RequestMapping("/greet")
	public String greet() {
		
		return "Greetings!!";
	}
}
