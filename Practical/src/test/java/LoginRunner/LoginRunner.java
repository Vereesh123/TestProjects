package LoginRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		features = {"src/test/java/LoginFile/login.feature"},
		dryRun = false,
		glue = "LoginSteps",
		monochrome = true,
		tags = "@Smoke"
		
		
		)


  

public class LoginRunner extends AbstractTestNGCucumberTests {
	
	
}
