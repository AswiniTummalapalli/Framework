package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import libraries.Utilities;

public class LoginPage {
	WebDriver driver;

	public static By email=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	                              
	public static By password=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	public static By login=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	

	public LoginPage(WebDriver driver) {
		this.driver=driver;

	}


	//@FindBy(how=How.XPATH , using="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")


	/*@FindBy(how=How.XPATH, using="html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	public static WebElement password;

	@FindBy(how=How.XPATH, using="html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	public static WebElement login;*/



	public void loginToApplication() throws Exception{
		try {
			driver.findElement(login).click();
			System.out.println(driver.getTitle());
			Utilities.captureScreenshot(driver, "Login");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
