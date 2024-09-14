package com.practice;

public class StringClass {
	
	public void stringLine() {    // method to print defined String variable
	
		String myname = "Dasha";
		System.out.println(myname);
	}
	
	public void stringLine2(String name) { // method to print undefined String variable
		
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		StringClass obj = new StringClass();
				obj.stringLine();
				obj.stringLine2("Badger");
	}
}
