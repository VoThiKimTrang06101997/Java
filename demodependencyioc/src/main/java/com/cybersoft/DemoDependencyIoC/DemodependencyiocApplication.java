package com.cybersoft.DemoDependencyIoC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cybersoft.DemoDependencyIoC.app.AppController;
import com.cybersoft.DemoDependencyIoC.app.EmailMessage;
import com.cybersoft.DemoDependencyIoC.app.FacebookMessage;
import com.cybersoft.DemoDependencyIoC.app.MessageService;
import com.cybersoft.DemoDependencyIoC.ioc.Ioc2Controller;
import com.cybersoft.DemoDependencyIoC.ioc.IocController;

@SpringBootApplication
public class DemodependencyiocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemodependencyiocApplication.class, args);
		// MessageService messageService = new EmailMessage();
//		MessageService messageService = new FacebookMessage();
//		
//		AppController appController = new AppController(messageService);
//		appController.send();
		
//		IocController controller = new IocController();
//		controller.getBean();
//		
//		Ioc2Controller controller2 = new Ioc2Controller();
//		controller2.getBean2();
	}

}
