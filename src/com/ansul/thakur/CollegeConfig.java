package com.ansul.thakur;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.ansul.thakur")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

}
