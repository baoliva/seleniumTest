package Pruebas;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Prueba1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// FirefoxProfile ff = new FirefoxProfile();
		// ff.setAcceptUntrustedCertificates(true);
		// WebDriver driver = new FirefoxDriver(ff);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\blankyliv\\Desktop\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ecuador.patiotuerca.com/ptx/");

		System.out.println("................ Waiting for loadin page");
		Thread.sleep(15000);
		System.out.println("................ Closed iframe marketing");

		WebElement tabMotorCredirLiElement = driver.findElement(By
				.cssSelector("li.tab-motor-credit > a"));

		if (tabMotorCredirLiElement.isEnabled()) {
			System.out.println(".......... ELEMENT:tabMotorCredirLiElement is Enabled");
			tabMotorCredirLiElement.click();
			System.out
					.println("................ Waiting for loadin finance page");
			Thread.sleep(4000);
			System.out.println("................ Loaded finance page");

			WebElement firstCardVehicleElement = driver
					.findElement(By
							.cssSelector("div.usedList #featuredUsed article:first-child div.card-image > a"));

			if (firstCardVehicleElement.isEnabled()) {
				System.out
						.println(".......... ELEMENT: firstCardVehicleElement is Enabled");
				firstCardVehicleElement.click();
				Thread.sleep(4000);

				// Open login modal
				WebElement btnFinance = driver.findElement(By
						.cssSelector("a.send-calculator-data"));
				btnFinance.click();

				// Login user
				WebElement inputUser = driver.findElement(By.id("emailSignIn"));
				inputUser.sendKeys("rosaolivo44@yahoo.com");
				// Login pass
				WebElement inputPass = driver.findElement(By.cssSelector("input#passwordSignIn"));
				inputPass.sendKeys("89060841356");
				//Button login action
				WebElement btnLogin = driver.findElement(By.id("btnLogin"));
				btnLogin.click();
				Thread.sleep(3000);
				
			   //Select RadioButton
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement radioisClient1 = driver.findElement(By.id("isClient1"));
				radioisClient1.click();
				Thread.sleep(400);
				WebElement termsAndConditions = driver.findElement(By.id("termsAndConditions"));
				termsAndConditions.click();
//				js.executeScript("document.getElementById('isClient1').setAttribute('class', 'radio-container right checked')");
//				js.executeScript("document.getElementById('termsAndConditions').setAttribute('class', 'check-container checked visible')");
				
				//Next ...
				WebElement btnNextStep=driver.findElement(By.cssSelector("button.next-button"));
				btnNextStep.click();
							
			} 
			else {
				System.out
						.println(".......... ELEMENT:firstCardVehicleElement is Disabled");
			}

		} else {
			System.out.println(".......... ELEMENT: tabMotorCredirLiElement is Disabled");
		}

	}

}
