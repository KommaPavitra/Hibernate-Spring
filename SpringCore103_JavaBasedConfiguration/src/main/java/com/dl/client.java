package com.dl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class client {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Bike.class);
		Brand bean1 = context.getBean("id1", Bike.class);
		System.out.println(bean1.honda());
		context.close();
	}

}
