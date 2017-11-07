package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import libraries.Utilities;

public class ContactUsPage {
	WebDriver driver;
	public static By contactLink=By.xpath("//*[@id=\"contact-link\"]/a");
	
	public ContactUsPage(WebDriver driver) {
		this.driver=driver;

	}
	
	public void visitContactUsPage() throws Exception{
		driver.findElement(contactLink).click();
		Select dropdown=new Select(driver.findElement(By.id("id_contact")));
		dropdown.selectByIndex(1);
		System.out.println("Selected option");
		Utilities.captureScreenshot(driver, "In Contact Us page");
	}

}
