package com.testingex;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class ScreenShort {
static WebDriver d;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
//		  ChromeDriver d=new ChromeDriver();
   		d=DriverClassForCommon.getChromeDriverInstance();
		  d.get("https://www.irctc.co.in/nget/train-search");
		  Thread.sleep(10);
		  
		  //take screen short
		  File screenshore=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshore, new File("D:\\tutorialhub\\recent.jpg"));
		d.close();
	
	}

}
