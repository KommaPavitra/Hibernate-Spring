package com.dl.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.dao.HondaDao;
import com.dl.model.Honda;

public class SelectRecord {
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");
		
		HondaDao honda = (HondaDao)context.getBean("hondaDao");
		
		List<Honda> listBikes = honda.listBikes();
		for (Honda h : listBikes) {
			System.out.println(h.getId());
			System.out.println(h.getBikeName());
			System.out.println(h.getBikeColor());
			System.out.println(h.getCc());
		}
		
		context.close();
	}

}
