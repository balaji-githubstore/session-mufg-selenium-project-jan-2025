package com.mufg.steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mufg.base.AutomationWrapper;
import com.mufg.pages.DashboardPage;
import com.mufg.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1Steps {
	@Given("I have browser with OrangeHRM application")
	public void i_have_browser_with_orange_hrm_application() {
		AutomationWrapper.driver = new ChromeDriver();
		AutomationWrapper.driver.manage().window().maximize();
		AutomationWrapper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		AutomationWrapper.driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		LoginPage.enterUsername(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		LoginPage.enterPassword(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		LoginPage.clickOnLogin();
	}

	@Then("I should get access to the dashboard with text as {string}")
	public void i_should_get_access_to_the_dashboard_with_text_as(String expectedValue) {
		String actualValue = DashboardPage.getQuickLaunchText();
		Assert.assertEquals(expectedValue, actualValue);
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String expectedError) {
		String actualError = LoginPage.getErrorMessage();
		Assert.assertEquals(expectedError, actualError);
	}
}
