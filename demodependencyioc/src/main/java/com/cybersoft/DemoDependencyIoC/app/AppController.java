package com.cybersoft.DemoDependencyIoC.app;

public class AppController  {
//	EmailMessage emailMessage;
//	FacebookMessage facebookMessage;
	
	MessageService messageService;
	
	public AppController(MessageService messageService) {
//		emailMessage = new EmailMessage();
//		facebookMessage = new FacebookMessage();
		this.messageService = messageService;
	}
	
	public void send() {
		// TODO Auto-generated method stub
//		emailMessage.sendMessage();
		messageService.sendMessage();
	}
}
