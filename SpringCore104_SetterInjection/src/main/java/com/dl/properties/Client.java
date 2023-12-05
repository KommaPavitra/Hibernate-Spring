package com.dl.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextProperties.xml");
		Honda bean = (Honda)context.getBean("id1");
		System.out.println(bean.getModel());
		context.close();
	}

}
