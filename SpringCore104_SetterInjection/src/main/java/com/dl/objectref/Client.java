package com.dl.objectref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextObjectRef.xml");
		Honda bean = (Honda)context.getBean("id1");
		System.out.println(bean.getModels());
		System.out.println(bean);
		context.close();
	}

}
