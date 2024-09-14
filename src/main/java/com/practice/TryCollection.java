package com.practice;

import java.util.ArrayList;
import java.util.List;

public class TryCollection {
	
	public List<Integer> ListArray() {
		List<Integer> myList = new ArrayList<>();
		
		//add method
		
		myList.add(2);
		myList.add(4);
		myList.add(5);
		myList.add(8);
		myList.add(9);
		myList.add(5);
		myList.add(4);
		
		System.out.println(myList);
		
		return myList;
	}
	
public static void main(String[] args) {
	TryCollection obj = new TryCollection ();
	obj.ListArray();
}
	
}
