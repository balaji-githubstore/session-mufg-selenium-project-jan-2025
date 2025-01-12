package com.mufg.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
		//features = {"src/test/resources/feature/Login.feature","src/test/resources/feature/Employee.feature"}
		features = {"src/test/resources/feature"}
		,glue = {"com.mufg.steps","com.mufg.base"}
		//,publish = true
		,plugin = {"html:target/cucumber-report.html"}
		,tags = "@employee"
		)

@RunWith(Cucumber.class)
public class RunnerTest {

}
