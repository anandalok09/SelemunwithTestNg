package com.testingex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClassForCommon {
	
	public static WebDriver getChromeDriverInstance(){
		WebDriver d=new ChromeDriver();
		
		return d;
	}

	public static void closebroseandtrimit(WebDriver d) {
		// TODO Auto-generated method stub
	d.close();
	d.quit();
		
	}

}
