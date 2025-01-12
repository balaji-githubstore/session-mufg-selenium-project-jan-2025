package com.mufg.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6FBCss {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.openemr.io/b/openemr");
		
		driver.findElement(By.cssSelector("#authUser")).sendKeys("admin");

		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
