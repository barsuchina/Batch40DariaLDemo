package com.practice;

public class ForLoop {
	
	public void getCount() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		
	}
		
	public void getNegativeCount() {
		for(int j=10; j>=0; j--) {
			System.out.print(j);
		}
		
	}
public static void main(String[] args) {
	ForLoop obj = new ForLoop();
	obj.getCount();
	obj.getNegativeCount();
}

} 
