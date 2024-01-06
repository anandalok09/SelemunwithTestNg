package com.testingex;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CopyOnetextboxtoSendanotherBox {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		

//		  ChromeDriver d=new ChromeDriver();
		WebDriver driver = DriverClassForCommon.getChromeDriverInstance();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		 
		Thread.sleep(10);
		 driver.switchTo().frame("iframeResult");
		 driver.findElement(By.id("fname")).sendKeys("Alok ANand");
		 WebElement source=driver.findElement(By.id("fname"));
		 WebElement destn=driver.findElement(By.id("lname"));
		 //
		 Actions ac=new Actions(driver);
		 //this is use to hover on given link
		 ac.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		 
		 ac.keyDown(destn, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		 
       
		 Thread.sleep(10000000);
		  
		  DriverClassForCommon.closebroseandtrimit(driver);

		

		
	

	}

}
