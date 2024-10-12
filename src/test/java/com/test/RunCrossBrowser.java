package com.test;

import com.generic.CrossBrowser;

public class RunCrossBrowser {

	public static void main(String[] args) {
		CrossBrowser obj = new CrossBrowser();
		obj.getCrossBrowser("chrome");
		obj.getCrossBrowser("firefox");
		obj.getCrossBrowser("msedge");
	}
	
}
