package com.mufg.pages;

import org.openqa.selenium.By;

import com.mufg.base.AutomationWrapper;

public class DashboardPage {
	private static By quickLaunchLocator=By.xpath("//p[contains(normalize-space(),'Quick')]");
	
	public static String getQuickLaunchText()
	{
		return AutomationWrapper.driver.findElement(quickLaunchLocator).getText();
	}

}
