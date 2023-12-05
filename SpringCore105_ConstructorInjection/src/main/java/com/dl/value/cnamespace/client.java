package com.dl.value.cnamespace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/value/cnamespace/applicationContext.xml");
		Location honda = (Location) context.getBean("id1");
		System.out.println(honda);
		context.close();
	}
	

}
