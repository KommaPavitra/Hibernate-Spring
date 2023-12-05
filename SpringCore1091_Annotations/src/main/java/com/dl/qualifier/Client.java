package com.dl.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/qualifier/applicationContext.xml");
		Honda bean = (Honda)context.getBean("id1");
		
		System.out.println(bean);
		
		context.close();
	}

}
//multiple beans
//to resolve the conflicts of  auto wiring conflicts.