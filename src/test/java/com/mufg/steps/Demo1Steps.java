package com.mufg.steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1Steps {
	WebDriver driver;
	
	@Given("I have browser with OrangeHRM application")
	public void i_have_browser_with_orange_hrm_application() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		driver.findElement(By.name("username")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Then("I should get access to the dashboard with text as {string}")
	public void i_should_get_access_to_the_dashboard_with_text_as(String expectedValue) {
	 String actualValue=driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
	 Assert.assertEquals(expectedValue, actualValue);
	}
	
	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String expectedError) {
		 String actualError=driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();	
		Assert.assertEquals(expectedError, actualError);
	}
}



