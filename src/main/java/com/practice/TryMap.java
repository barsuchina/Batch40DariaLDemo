package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class TryMap {
	
	public Map<String, String> SetMyMap() {
		Map<String, String> mymap = new LinkedHashMap<>();
		//Adding keys and values
		
		mymap.put("Name", "Dasha");
		mymap.put("City", "Moscow");
		mymap.put("Gender", "Female");
		
		System.out.println(mymap);
		
		return mymap;
	}

	public Map<String, Integer> SetMySalaryMap() {
		Map<String, Integer> mysalarymap = new LinkedHashMap<>();
		//Adding keys and values
		
		mysalarymap.put("Age", 41);
		mysalarymap.put("Zip", 03076);
		
		System.out.println(mysalarymap);
		
		return mysalarymap;
	}
	
	
	public static void main(String[] args) {
		TryMap obj = new TryMap();
		obj.SetMyMap();
		obj.SetMySalaryMap();
	}
	
}
