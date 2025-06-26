package com.runner.file;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		features = {"src/test/java/com.featurefile/login.feature"},
		dryRun =  false,
		glue = "com.login.steps",
		monochrome = true,
		tags = "@Smoke"
		)

public class runner_File extends AbstractTestNGCucumberTests {

}
