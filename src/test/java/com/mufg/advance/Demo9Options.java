package com.mufg.advance;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo9Options {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		//options.addArguments("start-maximized");
		options.addArguments("Zoom 80%");
		// options.addArguments("--disable-notifications");

		// change download dir
		HashMap<String, String> prefs = new HashMap<String, String>();
		prefs.put("download.default_directory", "C:\\session");
		options.setExperimentalOption("prefs", prefs);

		// mobile emulation
//		HashMap<String, String> map2 = new HashMap<String, String>();
//		map2.put("deviceName", "Pixel 7");
//		options.setExperimentalOption("mobileEmulation", map2);

		// always accept notifications
		Map<String, Object> pref1 = new HashMap<String, Object>();
		pref1.put("profile.default_content_setting_values.notifications", 2);
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.malaysiaairlines.com/us/en/home.html");

		driver.findElement(By.xpath("//span[text()='Accept all cookies']")).click();
		// approach 1 - not working
		// driver.findElement(By.xpath("//input[@name='dateDeparture']")).sendKeys("03
		// Apr 2025");

		// approach 2 - automate calendar if possible

		// approach 3- use javascript
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("document.querySelector(\"input[name='dateDeparture']\").value='03
		// Apr 2025'");
		// js.executeScript("document.querySelector(\"input[name='dateReturn']\").value='03
		// Jun 2025'");

		// approach 4 - Use javascript and webelement
		WebElement ele1 = driver.findElement(By.xpath("//input[@name='dateDeparture']"));
		js.executeScript("arguments[0].value='03 May 2025'", ele1);

		WebElement ele2 = driver.findElement(By.xpath("//input[@name='dateReturn']"));
		js.executeScript("arguments[0].value='03 Aug 2025'", ele2);
	}

}
