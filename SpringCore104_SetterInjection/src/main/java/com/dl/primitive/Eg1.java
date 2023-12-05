package com.dl.primitive;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Eg1 {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Honda honda = (Honda) context.getBean("id1");
		System.out.println(honda.getVno());
		System.out.println(honda.getVname());
		context.close();
	}

}
