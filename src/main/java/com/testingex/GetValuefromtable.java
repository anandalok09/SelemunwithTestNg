package com.testingex;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetValuefromtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		
//		  ChromeDriver d=new ChromeDriver();
   		WebDriver driver = DriverClassForCommon.getChromeDriverInstance();
   		driver.get("https://www.dominos.co.in/store-locations/");
		  Thread.sleep(10);
	
		 List<WebElement> row=driver.findElements(By.xpath("//div[@Class=\"carousel-inner\"] //div[@Class=\"row\"]"));
		  
		  for(WebElement r:row) {
			  List<WebElement> cell=r.findElements(By.xpath("//div[@Class=\"st-section-body st-m-height\"]/ul/li/p"));
			  for(WebElement c:cell) {
				  System.out.println(c.getText());
			  }
			  System.out.println("=======================");
		  }
		  
//		  List<WebElement> rows = driver.findElements(By.cssSelector("table.table2 tr"));
//		  for (WebElement row: rows) {
//		      List<WebElement> cells = row.findElements(By.cssSelector("td"));
//		      for (WebElement cell: cells) {
//		          System.out.println(cell.getText());
//		      }
//		  }
		  
		  
		  
		  
		  
		  
		  DriverClassForCommon.closebroseandtrimit(driver);
		//d.close();
	
	
	}

}
