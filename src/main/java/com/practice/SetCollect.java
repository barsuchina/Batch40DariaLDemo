package com.practice;

import java.util.HashSet;
import java.util.Set;

public class SetCollect {

	public Set<Integer> getSet() {
		Set<Integer> myset = new HashSet<>();
		
		myset.add(2);
		myset.add(4);
		myset.add(5);
		myset.add(8);
		myset.add(9);
		myset.add(5);
		myset.add(4);
		
		System.out.println(myset);
		
		return myset;
		
	}
	
	public static void main(String[] args) {
		SetCollect obj = new SetCollect();
		obj.getSet();
	}
}
