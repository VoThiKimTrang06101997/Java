package com.cybersoft.DemoDependencyIoC.app;

public class FacebookMessage implements MessageService {

	@Override
	public void sendMessage() {
		System.out.println("Facebook message");
		
	}
	
}
