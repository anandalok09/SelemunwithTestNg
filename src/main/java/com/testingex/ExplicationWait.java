package com.testingex;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicationWait {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver d=DriverClassForCommon.getChromeDriverInstance();
				  d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
				
				  WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(10));
				  wait.until(ExpectedConditions.visibilityOf(d.findElement(By.className(".table"))));
				  d.switchTo().frame("iframeResult");
				  d.switchTo().frame("iframeResult");
				  d.findElement(By.tagName("button")).click();
				
				 Alert al =d.switchTo().alert();
				  System.out.println("this is swithch==="+al.getText());
				  al.accept();
					  
				  d.switchTo().parentFrame();
				  
				  d.close();


	}

}
