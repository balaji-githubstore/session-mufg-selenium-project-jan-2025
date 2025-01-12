package com.mufg.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3Actions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://online-video-cutter.com/");
		
		//Mousehover on Converter
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Converters']"))).perform();
		
		driver.findElement(By.xpath("//a[normalize-space()='Audio Converter']")).click();
		
		

	}

}
