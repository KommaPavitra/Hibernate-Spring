package com.dl.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/constructorinjection/applicationContext.xml");
		Honda honda = (Honda) context.getBean("id1");
		System.out.println(honda);
		context.close();
	}

}
