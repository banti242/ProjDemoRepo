package pageObject;

import static stepDefination.LoginStepdef.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dashboardpage {

	private WebElement product;

	public WebElement getProduct() {
		product = driver.findElement(By.xpath("//*[text()='Products']"));
		return product;
	}

}
