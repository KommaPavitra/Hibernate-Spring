package com.dl.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.dao.HondaDao;

public class DeleteRecord {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");
		HondaDao dao = (HondaDao)context.getBean("hondaDao");
		
		int deleteRecord = dao.deleteRecord(7867);
		System.out.println(deleteRecord);
		
		context.close();
	}

}
