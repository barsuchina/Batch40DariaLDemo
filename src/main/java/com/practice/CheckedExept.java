package com.practice;

public class CheckedExept {
	
	int a = 5;
	public void getNumber() {
		System.out.println(a);
		System.out.println(a+5);
		
		try {
		System.out.println(a/0);} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(a+10);
	}
	
	public static void main(String[] args) {
		CheckedExept obj =  new CheckedExept();
		obj.getNumber();
	}
	
	
	

}
