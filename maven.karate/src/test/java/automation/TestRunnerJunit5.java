package automation;

import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

public class TestRunnerJunit5 {

//	@Test
//	public Karate runTest() {
//		return Karate.run("getAPI1").relativeTo(getClass()).tags("@smoke");
//	}
	
	@Test
	public Karate runTestClassPath() {
		return Karate.run("classpath:automation/allFeatures").tags("@smoke");
	}
}
