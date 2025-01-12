package com.mufg.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5ActionsKeyboard {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com");
		
		Actions actions=new Actions(driver);
		//selenium version 4.27 --> no need Build()
		//Selenium version < 4 --> Add Build() when clubbing more than one actions method 
		actions.click(driver.findElement(By.name("q"))).keyDown(Keys.SHIFT).sendKeys("hello world").keyUp(Keys.SHIFT).pause(1000)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ENTER)		
		.build().perform();

	}

}
