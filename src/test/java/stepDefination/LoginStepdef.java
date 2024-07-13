package stepDefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Dashboardpage;
import pageObject.LoginPage;

public class LoginStepdef {
	public LoginPage loginPage;
	public Dashboardpage dashboard;

	public static WebDriver driver;

	@Given("User has launch url {string}")
	public void user_has_launch_url(String url) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	@When("User has entered username {string} and password {string}")
	public void user_has_entered_username_and_password(String UserName, String Pwd) {

		loginPage = new LoginPage();
		loginPage.getUsername().sendKeys(UserName);
		loginPage.getPassword().sendKeys(Pwd);

		/*
		 * WebElement userName = driver.findElement(By.xpath("//*[@id='user-name']"));
		 * userName.sendKeys(UserName); WebElement password =
		 * driver.findElement(By.xpath("//*[@id='password']")); password.sendKeys(Pwd);
		 */
	}

	@When("User has entered credentials")
	public void user_has_entered_credentials(DataTable table) {
		List<Map<String, String>> crenditals = table.asMaps(String.class, String.class);
		WebElement userName = driver.findElement(By.xpath("//*[@id='user-name']"));
		userName.sendKeys(crenditals.get(1).get("Username"));
		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		password.sendKeys(crenditals.get(1).get("Password"));

	}

	@When("User has clicked on login button")
	public void user_has_clicked_on_login_button() {

		loginPage.getLogin().click();

		/*
		 * WebElement loginButton =
		 * driver.findElement(By.xpath("//*[@id='login-button']")); loginButton.click();
		 */

	}

	@Then("User verify {string} on dasboard")
	public void user_verify_on_dasboard(String text) {

		dashboard = new Dashboardpage();

		// WebElement textName = driver.findElement(By.xpath("//*[text()='" + text +
		// "']"));
		Assert.assertTrue(dashboard.getProduct().isDisplayed());

		System.out.println("TEst");

	}

	@When("User has entered Invalid credentials")
	public void user_has_entered_invalid_credentials(DataTable crenditals) {

		System.out.println("TEst");

	}

}
