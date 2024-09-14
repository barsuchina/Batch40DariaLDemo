package com.practice;

import java.util.Arrays;

public class TryArray {

	int a = 10;
	int[] b = {10, 20, 30, 40}; //single dimentional
	int[] c = {50, 60, 70, 80};
	int[][] d = {{1, 2, 3, 4, 5}, {6, 7, 8}}; //multi dimentional
	int[][] e = {b, c}; //multi dimentional too
	
	public void getArrays() {
		System.out.println(a);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.deepToString(d));
		System.out.println(Arrays.deepToString(e));
	}
	
	public static void main(String[] args) {
		TryArray obj = new TryArray();
		obj.getArrays();
	}
	
}
