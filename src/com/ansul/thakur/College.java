package com.ansul.thakur;

public class College {
	
	private Principal principal;
	
	/*
	 * public College(Principal principal) { this.principal = principal; }
	 */

	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("setter injection!!");
	}

	public void test() {
		principal.principalInfo();
		System.out.println("Testing College..");
	}

}
