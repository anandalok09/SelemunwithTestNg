package com.testingex;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	int count = 0;


	
	@Test(dataProvider ="extrinlize" ,dataProviderClass =DataSourceFromClass.class )
	public void test1(String username, String password) {
		
		
		System.out.println("username test==="+username);
		System.out.println("password test==="+password);
		
		
	}
	@Test(dataProvider ="dynamic" ,dataProviderClass =DataSourceFromClass.class )
	public void test(String username, String password) {
		
		
		System.out.println("username test==="+username);
		System.out.println("password test==="+password);
		
		
	}
	
	
	
	@Test
	public void add() {
		count++;
		System.out.println("Enter the value of first=" + count);
		int i = 10;
		int y = 10;
		Assert.assertEquals(i, y);
	}

	@BeforeMethod
	public void beforeMethod() {
		count++;
		System.out.println("Before Method===============" + count);
		int i = 10;
		int y = 10;
		Assert.assertEquals(i, y);
	}

	@AfterMethod
	public void afterMethod() {
		count++;
		System.out.println("After Method===============" + count);
		int i = 10;
		int y = 10;
		Assert.assertEquals(i, y);
	}

	@BeforeTest
	public void beforeTest() {
		count++;
		System.out.println("beforeTest===============" + count);
		int i = 10;
		int y = 10;
		Assert.assertEquals(i, y);
	}

	@AfterTest
	public void AfterTest() {
		count++;
		System.out.println("AfterTest===============" + count);
		int i = 10;
		int y = 10;
		Assert.assertEquals(i, y);
	}

	@BeforeClass
	public void BeforeClass() {
		count++;
		System.out.println("BeforeClass===============" + count);
		int i = 10;
		int y = 10;
		Assert.assertEquals(i, y);
	}

	@AfterClass
	public void AfterClass() {
		count++;
		System.out.println("@AfterClass===============" + count);
		int i = 10;
		int y = 10;
		Assert.assertEquals(i, y);
	}

	@Test(groups = { "regular", "expracion" })
	public void Group() {
		count++;
		System.out.println("Group test===============" + count);
		int i = 10;
		int y = 10;
		Assert.assertEquals(i, y);
	}
}
