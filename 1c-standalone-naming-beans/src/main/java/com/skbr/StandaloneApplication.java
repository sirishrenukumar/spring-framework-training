package com.skbr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		

		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("beans.xml");
		MessageGenerator messageGenerator1 = applicationContext1.getBean(MessageGenerator.class);

		System.out.println(messageGenerator1.getMessage());

		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("beans.xml");
		MessageGenerator messageGenerator2 = (MessageGenerator) applicationContext2.getBean("generator");

		System.out.println(messageGenerator2.getMessage());

	}
}
