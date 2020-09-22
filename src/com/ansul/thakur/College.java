package com.ansul.thakur;

public class College {
	
	private Principal principal;
	
	public College(Principal principal) {
		this.principal = principal;
	}

	public void test() {
		principal.principalInfo();
		System.out.println("Testing College..");
	}

}
