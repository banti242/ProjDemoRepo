package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "stepDefination", "hooks" }, tags = " @ScenarioOtline", plugin = {
		"pretty", "html:target/cucumber-reports/report.html" }, monochrome = true)

public class RunTestTestNG extends AbstractTestNGCucumberTests {

	@DataProvider(parallel = true)
	public Object[][] scenario() {
		return super.scenarios();
	}

}
