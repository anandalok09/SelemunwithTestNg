package com.testingex;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FulantWait {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
				WebDriver d=DriverClassForCommon.getChromeDriverInstance();
				  d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
				
				  Wait<WebDriver> wait=new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(10))
						  .pollingEvery(Duration.ofSeconds(10)).withMessage("Note visibal").ignoring(NoSuchElementException.class);
				  
				  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) d.findElement(By.xpath("/jhjhkjsd"))));
				  
				  
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
