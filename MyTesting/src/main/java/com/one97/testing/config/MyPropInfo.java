package com.one97.testing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyPropInfo {
	
	@Bean
	public MyProp getMyProp(){
		return new MyProp();
	}
	

}
