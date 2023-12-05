package com.dl.valueasattribute;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/valueasattribute/applicationContext.xml");
		Location honda = (Location) context.getBean("id1");
		System.out.println(honda);
		context.close();
	}
	

}
