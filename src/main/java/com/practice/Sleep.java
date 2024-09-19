package com.practice;

public class Sleep {
	
	public void HelloGrizzly() {
		System.out.println("Hello");
			
		try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Dasha");
	}
	
	public static void main(String[] args) {
		Sleep obj =  new Sleep();
		obj.HelloGrizzly();
	}

}
