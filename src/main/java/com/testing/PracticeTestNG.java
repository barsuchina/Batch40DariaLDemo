package com.testing;

import org.testng.annotations.Test;

public class PracticeTestNG {
	
	@Test(priority=3, groups = {"smoke"})
	public void getLogin() {
		System.out.println("Login method");
	}
	
	@Test(priority=0, groups = {"smoke"})
	public void getSearch() {
		System.out.println("search");
	}
	
	@Test(priority=1)
	public void getCart() {
		System.out.println("cart");
	}

	@Test(priority=2)
	public void getPay() {
		System.out.println("Pay mathod");
	}

}
