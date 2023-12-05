package com.dl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Brand bean1 = context.getBean("id1", Brand.class);
		System.out.println(bean1.honda());
		
		Brand bean2 = context.getBean("id2", Brand.class);
		System.out.println(bean2.honda());
		context.close();
		
	}

}
