package com.dl.pcnamespace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/pcnamespace/applicationContext.xml");
		Location honda = (Location) context.getBean("id1");
		System.out.println(honda);
		context.close();
	}
	

}
