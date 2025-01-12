package com.mufg.advance;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1UploadTest {
	
	public static void main(String[] args) {
			
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Session\\demo.pdf");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='50%';");
		
		Dimension dim= driver.manage().window().getSize();
		System.out.println(dim.width);
		System.out.println(dim.height);
		
		//set size
		Dimension dimSet=new Dimension(1000, 600);
		//driver.manage().window().setSize(dimSet);
		
	}

}
