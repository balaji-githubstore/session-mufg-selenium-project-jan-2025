package com.mufg.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7JS {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.malaysiaairlines.com/us/en/home.html");
		
		driver.findElement(By.xpath("//span[text()='Accept all cookies']")).click();
		//approach 1 - not working
		//driver.findElement(By.xpath("//input[@name='dateDeparture']")).sendKeys("03 Apr 2025");

		//approach 2 - automate calendar if possible 
		
		
		//approach 3- use javascript 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"input[name='dateDeparture']\").value='03 Apr 2025'");
		js.executeScript("document.querySelector(\"input[name='dateReturn']\").value='03 Jun 2025'");
		
	}

}
