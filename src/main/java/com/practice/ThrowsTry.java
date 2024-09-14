package com.practice;

public class ThrowsTry {
	
	public void Examp() throws InterruptedException {
		System.out.println("Hello");
		
		Thread.sleep(3000);
		
		System.out.println("Bear");
	}

	public static void main(String[] args) throws InterruptedException {
		ThrowsTry obj = new ThrowsTry();
		obj.Examp();
	}
	
}
