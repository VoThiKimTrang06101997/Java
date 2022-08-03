package com.cybersoft.DemoDependencyIoC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.DemoDependencyIoC.ioc.Users;

@RestController
@RequestMapping("/home")
public class DemoIoCController {
	@Autowired
	Users users;
	
	@GetMapping("")
	public String index() {
		System.out.println("User name: " + users.getUserName());
		System.out.println("Password: " + users.getPassWord());
		return "Hello";
	}
}
