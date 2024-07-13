package pageObject;

import static stepDefination.LoginStepdef.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebElement Username;
	private WebElement Password;
	private WebElement Login;

	public WebElement getUsername() {
		Username = driver.findElement(By.xpath("//*[@id='user-name']"));
		return Username;
	}

	public WebElement getPassword() {
		Password = driver.findElement(By.xpath("//*[@id='password']"));
		return Password;
	}

	public WebElement getLogin() {
		Login = driver.findElement(By.xpath("//*[@id='login-button']"));
		return Login;
	}

}
