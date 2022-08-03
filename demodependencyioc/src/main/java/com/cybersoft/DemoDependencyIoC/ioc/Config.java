package com.cybersoft.DemoDependencyIoC.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Users users() {
		System.out.println("Kiểm tra");
		
		Users users = new Users();
		users.setUserName("Anotation Bean");
		users.setPassWord("654321");
		
		return users;	
	}
}
