package StepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ContactUsPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class SampleStepDefn {
	
	public WebDriver driver;
	public SampleStepDefn() {
		super();
		
	}

	
	@Given("^User opens application$")
	public void user_opens_application() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AXT8602\\eclipse-workspace\\Framework\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		

	}

	@When("^User is navigated toHomepage$")
	public void user_is_navigated_toHomepage() throws Throwable {
		HomePage homePage=new HomePage(driver);
		homePage.goToHomePage();
	     
	}

	@Then("^click on sign in link$")
	public void click_on_sign_in_link() throws Throwable {
		LoginPage login=new LoginPage(driver);
		login.loginToApplication();
	     
	}

	
	@Then("^Goto Orders Page$")
	public void goto_Orders_Page() throws Throwable {

		
	}
	@Then("^visit Contact Us page$")
	public void visit_Contact_Us_page() throws Throwable {
	   
	     ContactUsPage contact=new ContactUsPage(driver);
	     contact.visitContactUsPage();
	     
	     driver.quit();
	}

}
