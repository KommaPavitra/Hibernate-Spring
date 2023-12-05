package com.dl.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Eg1 {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_Collections.xml");
		Honda honda = (Honda) context.getBean("id1");
		System.out.println(honda);
		
	    context.close();
	}


}
