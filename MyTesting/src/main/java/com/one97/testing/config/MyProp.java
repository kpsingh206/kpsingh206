package com.one97.testing.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:kp.properties")
public class MyProp {
	
	@Value("${firstname}")
	private String firstname;
	
	@Value("${lastname}")
	private String lastname;

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
	
	

}
