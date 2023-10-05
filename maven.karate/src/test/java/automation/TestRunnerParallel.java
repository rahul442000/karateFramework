package automation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;

public class TestRunnerParallel {

    @Test
    public void testParallel() {
        Results results = Runner.path("classpath:automation/allFeatures").tags("@smoke").parallel(5);
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }

}