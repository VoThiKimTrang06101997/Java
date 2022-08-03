package com.cybersoft.DemoDependencyIoC.app;

public class EmailMessage implements MessageService {

	@Override
	public void sendMessage() {
		System.out.println("Email message");
	}
}
