package com.runner.file;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src/test/java/com.featurefile/loginpage.feature"},
		dryRun = false,
		glue = "com.second.login.steps",
		monochrome = true,
		tags = "@Smoke"
		
		)


public class RunnerfileTestAutomation extends AbstractTestNGCucumberTests {

}
