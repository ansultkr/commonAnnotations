package com.ansul.thakur;

public class College {
	
	private Principal principal;
	private Teacher teacher;

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("setter injection!!");
	}

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("Testing College..");
	}

}
