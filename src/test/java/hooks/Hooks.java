package hooks;

import static stepDefination.LoginStepdef.driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before()
	public void setUp(Scenario scenario) {

		System.out.println("I am Before Scenario");

	}

	@After()
	public void tearDown(Scenario scenario) {

		System.out.println("I am After Scenario");
		driver.quit();

	}

	@BeforeStep()
	public void actionBeforeeachStep() {

		System.out.println("I am BeforeStep Scenario");

	}

	@BeforeStep()
	public void actionAftereachStep() {

		System.out.println("I am AfterStep Scenario");

	}

}
