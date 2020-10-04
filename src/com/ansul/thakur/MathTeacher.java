package com.ansul.thakur;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{
	
	@Override
	public void teach() {
		System.out.println("Hi i am your Maths TEacher\nSourav");
	}

}
