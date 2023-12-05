package com.dl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("id1")
@Configuration
@ComponentScan("com.dl.one.javabasedconfiguration")

public class Bike implements Brand{

	@Override
	@Bean
	public String honda() {
		// TODO Auto-generated method stub
		return "Hero Honda";
	}
	
}
