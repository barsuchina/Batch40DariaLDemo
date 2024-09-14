package com.practice;

public class PracticeObject {
	
	private int b;
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void getMoney() {
		
		System.out.println("Create an object");
	}
	
	public static void main(String[] args) {
		PracticeObject obj = new PracticeObject();
		obj.getMoney();
	}




}
