package automation;

import org.junit.runner.RunWith;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;

import io.cucumber.junit.CucumberOptions;

@RunWith(Karate.class)
@CucumberOptions(features = "classpath:automation/allFeatures")
@KarateOptions(tags = "@regression")
public class TestRunnerJunit4 {

}
