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

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("blanky.oliva89@gmail.com");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("blanky.oliva89@gmail.com");
	}

	@Then("^user should be able to login successfull$")
	public void user_should_be_able_to_login_successfull() throws Throwable {
	 driver.findElement(By.id("loginbutton")).click();  
	}
}
