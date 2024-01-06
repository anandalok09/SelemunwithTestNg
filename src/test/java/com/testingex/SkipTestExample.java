package com.testingex;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestExample {

	@Test(enabled = false)
	public void skiptestfirstmethod() {
		System.out.println("skip test here=====");
	}
	@Test
	public void skiptestsecondmethod() {
		throw new SkipException("================================================we have skip method===");
	}
	
	
}
