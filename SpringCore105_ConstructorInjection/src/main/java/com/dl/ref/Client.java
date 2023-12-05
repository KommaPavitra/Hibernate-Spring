package com.dl.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/ref/applicationContextObjectRef.xml");
		Honda bean = (Honda)context.getBean("id3");

		System.out.println(bean);
		context.close();
	}
}

