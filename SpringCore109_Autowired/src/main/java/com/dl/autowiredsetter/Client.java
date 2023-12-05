package com.dl.autowiredsetter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/autowiredsetter/applicationContext.xml");
		Honda bean = (Honda)context.getBean("id1");
		System.out.println(bean);
		context.close();
	}

}
