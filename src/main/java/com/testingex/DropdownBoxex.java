package com.testingex;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownBoxex {

	public static void main(String[] args)throws InterruptedException {
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
