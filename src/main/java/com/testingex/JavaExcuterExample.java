package com.testingex;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaExcuterExample {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		WebDriver dr=DriverClassForCommon.getChromeDriverInstance();

        dr.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)dr;	
        dr.get("https://www.w3schools.com/howto/howto_css_custom_scrollbar.asp");         //testing webpage
       
       js.executeScript("window.location = 'https://demo.guru99.com/'");
       
     
		  dr.close();
		
	
	}

}
