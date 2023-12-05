package com.dl.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.dao.HondaDao;
import com.dl.models.Honda;

public class Insert {
	
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HondaDao hondaDao = (HondaDao)context.getBean("hondadao");
		
		Honda h = new Honda();
		h.setId(1);
		h.setBikeName("Honda CBR");
		h.setBikeColor("Red");
		h.setCc(200.00);
		
		int create = hondaDao.create(h);
		System.out.println("Data Inserted: " + create);
		context.close();
	}

}
