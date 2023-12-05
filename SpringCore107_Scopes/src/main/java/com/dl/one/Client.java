package com.dl.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("com/dl/one/applicationContext.xml");
		Honda bean1 = (Honda)c1.getBean("id1");
		System.out.println(bean1);
		System.out.println(bean1.getVno());
		System.out.println(bean1.getVnames());
		System.out.println(bean1.hashCode());
		
		Honda bean2 = (Honda)c1.getBean("id1");
		System.out.println(bean2);
		System.out.println(bean2.getVno());
		System.out.println(bean2.getVnames());
		System.out.println(bean2.hashCode());
		
		c1.close();
	}

}
