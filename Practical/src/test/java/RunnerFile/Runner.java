package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		features = {"src/test/java/FeatureFile/signin.feature"},
		dryRun =  false,
		glue ="StepsFile",
		
		monochrome = true,
		tags = "@Smoke"

		
		)

public class Runner extends AbstractTestNGCucumberTests {

}
