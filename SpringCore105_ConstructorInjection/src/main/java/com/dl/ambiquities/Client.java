package com.dl.ambiquities;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/ambiquities/applicationContext.xml");
		Student bean = (Student)context.getBean("id1");

		System.out.println(bean.getClass());
		context.close();

}
}