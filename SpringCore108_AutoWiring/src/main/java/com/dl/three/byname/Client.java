package com.dl.three.byname;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/three/byname/applicationContext.xml");
		Honda bean = (Honda)context.getBean("id1");
		System.out.println(bean);
		System.out.println(bean.getModels());
		context.close();
	}

}
