package Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"},
		glue = {"Steps"},
		plugin = {"pretty", "json:target/json-report/cucumber.json"},
		dryRun = false,
		strict = true,
		tags = {"@Tag2 or @Tag1"},
		monochrome = true	
		)

public class TestRunner {

}
