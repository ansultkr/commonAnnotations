package com.ansul.thakur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Value("${college.Name}")
	private String collegeName;
	
	@Autowired
	private Principal principal;
	@Autowired
	private Teacher teacher;
	
	

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("Shitty college:: "+collegeName);
		
		System.out.println("Testing College..");
	}

}
