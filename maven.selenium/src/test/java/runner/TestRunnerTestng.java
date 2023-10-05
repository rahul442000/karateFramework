package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "",
		features = {"src/test/java/features"},
		glue = {"steps"},
		plugin = {
				"pretty",
				"html:test-output/cucumberReport",
		})
public class TestRunnerTestng extends AbstractTestNGCucumberTests {
    
}