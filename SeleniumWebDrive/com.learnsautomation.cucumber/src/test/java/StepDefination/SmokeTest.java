package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;
	@Given("^Open Firefox and start application$")
	public void Open_Firefox_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\blankyliv\\Desktop\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	}

	@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_and_valid(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(arg2);
	}

	@Then("^user should be able to login successfull$")
	public void user_should_be_able_to_login_successfull() throws Throwable {
	 driver.findElement(By.id("loginbutton")).click();  
	}
	
	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
	    driver.quit();
	}
	}
