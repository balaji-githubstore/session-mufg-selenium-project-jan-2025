package com.mufg.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.mufg.base.AutomationWrapper;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {

	@When("I click on PIM menu")
	public void i_click_on_pim_menu() {
		AutomationWrapper.driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
	}

	@When("I click on Add Employee Menu")
	public void i_click_on_add_employee_menu() {
		AutomationWrapper.driver.findElement(By.xpath("//a[normalize-space()='Add Employee']")).click();
	}

	@When("I fill the employee details form")
	public void i_fill_the_employee_details_form(DataTable dataTable) {
		System.out.println(dataTable);
		List<Map <String, String>> lists= dataTable.asMaps();
		
		System.out.println(lists);
		System.out.println(lists.get(0));
		System.out.println(lists.get(0).get("first_name"));
		System.out.println(lists.get(0).get("middle_name"));
		System.out.println(lists.get(0).get("last_name"));
		
		AutomationWrapper.driver.findElement(By.name("firstName")).sendKeys(lists.get(0).get("first_name"));
	}

	@When("I click on save")
	public void i_click_on_save() {

	}

	@Then("I should get the added name as {string}")
	public void i_should_get_the_added_name_as(String string) {

	}

}
