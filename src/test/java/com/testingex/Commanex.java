package com.testingex;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Commanex {

	@BeforeSuite
	public void testData() {
		System.out.println("This is before suit======================");
	}
	
	@DataProvider(name ="create")
	public Object[][] dataset(){
		
		return new Object[][] {
			{
				"Alok","Password"
			},
			{
				"Alok1","Password1"
			},
		};
	
	
}
	@Test(dataProvider ="create" )
	public void getdataset(String username, String password) {
		
		System.out.println("username========="+username);
		System.out.println("password========="+password);
	}
	
}