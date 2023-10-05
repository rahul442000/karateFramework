package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "",
		features = {"src/test/java/features"},
		glue = {"steps"},
		plugin = {
				"pretty",
				"html:test-output/cucumberReport",
		})
    
public class TestRunnerJUnit {
    
}