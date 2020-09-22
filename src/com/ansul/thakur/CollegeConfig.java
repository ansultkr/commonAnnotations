package com.ansul.thakur;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	
	@Bean(name="colbean")
	public College collegeBean() {
		return new College();
	}
}
