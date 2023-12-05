package com.dl.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.dao.HondaDao;
import com.dl.model.Honda;

public class InsertRecord {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext  c = new  ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");
		
		HondaDao dao = (HondaDao)c.getBean("hondaDao");
		
		Honda honda = new Honda();
		
		honda.setId(7867);
		honda.setBikeColor("white");
		honda.setBikeName("Honda Aviator");
		honda.setCc(150.00);
		
        int h = dao.insertRecord(honda);
        System.out.println("Record Save into Database: " + h);
		c.close();
		
		
	}

}
