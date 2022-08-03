package com.cybersoft.demospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/home")
	public String index() {
		return "Hello Spring";
	}
	
	@GetMapping("/login") 
	public String login() {
		return "Login";
	}
}
