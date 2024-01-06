package com.testingex;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.interactions.Action;

public class AlertBoxHandel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=DriverClassForCommon.getChromeDriverInstance();
		  d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		  Thread.sleep(100);
		
		  d.switchTo().frame("iframeResult");
		  d.findElement(By.tagName("button")).click();
		  Thread.sleep(100);
		 Alert al =d.switchTo().alert();
		  System.out.println("this is swithch==="+al.getText());
		  al.accept();
		  //System.out.println(alerttext);
		  Thread.sleep(2000);
		  d.switchTo().parentFrame();
		  
		  d.close();
		
		
		
	}

}
