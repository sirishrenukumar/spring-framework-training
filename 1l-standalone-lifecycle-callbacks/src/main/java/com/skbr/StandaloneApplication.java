package com.skbr;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneApplication {

	public static void main(String[] args) {
		

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		applicationContext.registerShutdownHook();

	}

}
