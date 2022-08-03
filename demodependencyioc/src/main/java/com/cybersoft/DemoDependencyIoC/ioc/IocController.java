package com.cybersoft.DemoDependencyIoC.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocController {
	// Cách 1
//	ClassPathXmlApplicationContext context;
//	
//	public IocController() {
//		// TODO Auto-generated constructor stub
//		context = new ClassPathXmlApplicationContext("beans.xml");
//	}
//	
//	public void getBean() {
//		Users users = (Users) context.getBean("users");
//		users.setUserName("Nguyễn Văn B");
//		System.out.println("User name 1: " + users.getUserName());
//	}
	
	@Autowired
	Users users;
	
	public void getBean() {
		System.out.println("Usernanme: " + users.getUserName());
	}
}
