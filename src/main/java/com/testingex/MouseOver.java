package com.testingex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
//		  ChromeDriver d=new ChromeDriver();
 		WebDriver driver = DriverClassForCommon.getChromeDriverInstance();
 		driver.get("https://www.w3schools.com/CSSref/tryit.php?filename=trycss_sel_hover");
		 
 		Thread.sleep(10);
		 driver.switchTo().frame("iframeResult_0");
		 WebElement el=driver.findElement(By.tagName("a"));
		 //
		 Actions ac=new Actions(driver);
		 //this is use to hover on given link
		 ac.moveToElement(el).build().perform();
		 Thread.sleep(100);
         //this is use to right click
		 ac.contextClick(el).build().perform();
		 
		 Thread.sleep(1000);
		 //this is click on element
		 ac.click().build().perform();
		 
		 
		 
		 Thread.sleep(10000);
		  
		  DriverClassForCommon.closebroseandtrimit(driver);

		
		
	}

}
