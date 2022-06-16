package com.shop.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.shop.step_definition",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber-reports/report.html", 
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		tags = "@SubmitReview"
		 )

public class TestRunner {
}