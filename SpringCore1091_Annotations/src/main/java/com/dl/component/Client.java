package com.dl.component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/component/applicationContext.xml");
		
		//Honda honda = new Honda();
		//honda is my object ref
		
		Honda honda = (Honda)context.getBean("honda");
		System.out.println(honda);
		System.out.println(honda.getModels());
		
		
		context.close();
	}

}
