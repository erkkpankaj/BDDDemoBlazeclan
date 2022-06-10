package com.blazeclan.qa.testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "src\\test\\java\\com\\blazeclan\\qa\\features\\Search.feature" },
		glue = { "com.blazeclan.qa.setpsDefinition" }, 
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/MyRports/report.json", "junit:target/MyRports/report.xml"},
			// For proper alignment+format 
		//monochrome = true,
		// Used to check if implementation for any test steps is missing 
		//dryRun = true, 
		// Publish report on Cucumber cloud
		publish = true
		
		// Tags are used to execute the test cases based on the tagged categories
		//tags = {"@SmokeTest"},
		// tags = {"~@Smoke, @Regression"} // Exclude @Smoke test cases
		)
		public class TestRunner {
}
