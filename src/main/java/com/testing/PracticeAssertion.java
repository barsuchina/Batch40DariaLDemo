package com.testing;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAssertion {
	
	int x = 100;
	
//	@Test
//	public void getSalary(int x) {
//		if (x==100) {
//			System.out.println("Number matches");
//		} else {
//			System.out.println("Number doesn't match");
//		}
//	}

	@Test
	public void getMoney() {
		Assert.assertEquals(100, x);

	}
	
	
	
}
