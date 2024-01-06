package com.testingex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImplicitWait {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver d=DriverClassForCommon.getChromeDriverInstance();
				  d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
				  
				  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				  d.switchTo().frame("iframeResult");
				  d.findElement(By.tagName("button")).click();
				
				 Alert al =d.switchTo().alert();
				  System.out.println("this is swithch==="+al.getText());
				  al.accept();
					  
				  d.switchTo().parentFrame();
				  
				  d.close();

	}

}
