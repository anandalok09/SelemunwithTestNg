package com.testingex;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class HandelMultipleWindow {
static WebDriver d;
	
	public static void main(String[] args) throws Exception{
   		d=DriverClassForCommon.getChromeDriverInstance();
		  d.get("https://www.dominos.co.in/menu/chicken");
		  Thread.sleep(10);
		  d.manage().window().maximize();
		  
		  String parent=d.getWindowHandle();
		  Set<String> allwindowHandel=d.getWindowHandles();
		  
		   Iterator<String> s=allwindowHandel.iterator();
		  while(s.hasNext()) {
			  d.switchTo().window(s.next());
			  System.out.println("this is child window==="+d.getTitle());
		  }
		  
		  System.out.println("this is switch parent=="+d.switchTo().window(parent).getTitle());
		  
		  
		  d.close();
	
	}

}
