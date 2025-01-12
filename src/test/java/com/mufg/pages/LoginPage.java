package com.mufg.pages;

import org.openqa.selenium.By;

import com.mufg.base.AutomationWrapper;

public class LoginPage {

	private static By usernameLocator = By.name("username");
	private static By passwordLocator = By.name("password");
	private static By loginLocator = By.xpath("//button[normalize-space()='Login']");
	private static By errorLocator = By.xpath("//p[contains(normalize-space(),'Invalid')]");

	public static void enterUsername(String username) {
		AutomationWrapper.driver.findElement(usernameLocator).sendKeys(username);
	}

	public static void enterPassword(String password) {
		AutomationWrapper.driver.findElement(passwordLocator).sendKeys(password);
	}

	public static void clickOnLogin() {
		AutomationWrapper.driver.findElement(loginLocator).click();
	}

	public static String getErrorMessage() {
		return AutomationWrapper.driver.findElement(errorLocator).getText();
	}
}
