package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "stepDefination", "hooks" }, tags = " @ScenarioOtline", plugin = {
		"pretty", "html:target/cucumber-reports/report.html", "rerun:target/failed.txt" }, monochrome = true)

public class RunTest {

}
