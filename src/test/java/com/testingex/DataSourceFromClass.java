package com.testingex;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataSourceFromClass {

	@DataProvider(name="extrinlize")
	public Object[][] providedatasource(){
		return new Object[][] {
			{
				"Alok","Password"
			},
			{
				"Alok1","Password1"
			},
		};

	}

	@DataProvider(name="dynamic")
	public Object[][] providedatasourcedynamic(Method m){
		
		if(m.getName().equals("test")) {
			return new Object[][] {
				{
					"Alok","Password"
				},
				{
					"Alok1","Password1"
				},
			};	
		}else {
			
			
		}
		
		
		return new Object[][] {
			{
				"Alok","Password","Graph1"
			},
			{
				"Alok1","Password1","Graph1"
			},
		};

		
		
		
		
		
	}



}

