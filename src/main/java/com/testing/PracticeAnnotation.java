package com.testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeAnnotation {
	
	@Test
	public void getCart() {
		System.out.println("This is Test Annotation.");
		
	}
	
	@BeforeMethod
	public void getShopping() {
		System.out.println("This is BeforeMethod annotation");
	}
	
	@AfterSuite
	public void getMoney() {
		System.out.println("This is AfterSuite annotation");
	}
	
	@BeforeTest
	public void getSalary() {
		System.out.println("This is BeforeMethod annotation");
	}
}
