package com.ansul.thakur;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college =context.getBean("collegeBean",College.class);
		System.out.println("College Object created at:: "+college);
		college.test();
		((AnnotationConfigApplicationContext)context).close();
	}

}
