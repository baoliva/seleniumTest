package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTestDuolingo {

	WebDriver driver;
	@Given("^Open Chronme and start application$")
	public void open_Chronme_and_start_application() throws Throwable {
		
	System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\blankyliv\\Desktop\\chrome\\chromedriver.exe");
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.duolingo.com/");
	
	}

	@When("^I enter valid data for registrer$")
	public void i_enter_valid_data_for_registrer() throws Throwable {
       WebElement login = driver.findElement(By.id("signup-link"));
       login.click();
//       Thread.sleep(5000);
//       WebElement lenguaje= driver.findElement(By.xpath("//div[@id='signup-language']/section/div/div/div/div[5]/div/h2"));
//       lenguaje.click();
//       Thread.sleep(5000);
//       WebElement lenguajeNativo= driver.findElement(By.xpath("//div[@id='signup-language']/section/div/div/table/tbody/tr[7]/td/li"));
//       lenguajeNativo.click();
//       Thread.sleep(5000);
//       WebElement metaDiaria = driver.findElement(By.xpath("//div[@id='app']/div/div/ul/li[2]/label"));
//       metaDiaria.click();
//       Thread.sleep(4000);
//       WebElement buttonFijarMeta = driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div"));
//       buttonFijarMeta.click();
//       Thread.sleep(4000);
//       WebElement permitirChrome = driver.findElement(By.xpath("//div[@id='app']/div/div[3]/div"));
//       permitirChrome.click();       
//      Thread.sleep(4000);
//      WebElement comenzar = driver.findElement(By.xpath("//div[@id='app']/div/div[4]/div/div[2]/div"));
//      comenzar.click();
       
       
       
     Thread.sleep(5000);
     WebElement lenguaje= driver.findElement(By.cssSelector("div#signup-language div.section-inner-wide.section-inner div.login-signup-flag-list-container div.choose-language-flag-container.choose-language:nth-child(5)"));
     lenguaje.click();
     Thread.sleep(5000);
     WebElement lenguajeNativo= driver.findElement(By.cssSelector("table.form-table.choose-ui-language tbody tr:nth-child(3) li.choose-ui-language-row"));
     lenguajeNativo.click();
     Thread.sleep(5000);
     WebElement metaDiaria = driver.findElement(By.cssSelector("ul.goal-chooser li:nth-child(3) label.btn.btn-standard.btn-outline.daily-goal-option"));
     metaDiaria.click();
     Thread.sleep(4000);
     WebElement buttonFijarMeta = driver.findElement(By.cssSelector("div.welcome-step.daily-goal-chooser div.btn.btn-standard.btn-outline.set-goal"));
     buttonFijarMeta.click();
//     Thread.sleep(4000);
//     WebElement permitirChrome = driver.findElement(By.xpath("//div[@id='app']/div/div[3]/div"));
//     permitirChrome.click();       
//    Thread.sleep(4000);
//    WebElement comenzar = driver.findElement(By.xpath("//div[@id='app']/div/div[4]/div/div[2]/div"));
//    comenzar.click();
       
       //driver.find
//     WebElement lenguaje=driver.findElement(By.cssSelector("div#signup-language .section-white .space .section-inner-wide .section-inner .language-selection-container .login-signup-flag-list-container:nth-child(5)"));
	}

	@Then("^click on the button to login$")
	public void click_on_the_button_to_login() throws Throwable {
		//WebElement buttonLogin = driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[3]/span"));
		//   buttonLogin.click(); 
	}

	}