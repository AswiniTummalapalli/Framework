package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import libraries.Utilities;

public class HomePage {
	WebDriver driver;
	public static By women=By.linkText("Women");

	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

	public void goToHomePage() throws Exception{
		driver.findElement(women).click();
		System.out.println(driver.getTitle());
		Utilities.captureScreenshot(driver, "Home Page");
	}
}
