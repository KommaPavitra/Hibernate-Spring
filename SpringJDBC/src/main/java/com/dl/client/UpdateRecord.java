package com.dl.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.dao.HondaDao;
import com.dl.model.Honda;

public class UpdateRecord {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");
		HondaDao honda = (HondaDao)context.getBean("hondaDao");
		
		Honda h = new Honda();
		h.setId(7865);
		h.setBikeName("Honda CBR 2000");
		h.setBikeColor("Blue");
		h.setCc(1000.00);
		
		int updateRecord = honda.updateRecord(h);
		System.out.println(updateRecord);
		
		context.close();
	}

}
