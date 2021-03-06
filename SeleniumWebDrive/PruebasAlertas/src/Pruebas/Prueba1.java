package Pruebas;


import java.util.Random;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


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
		Thread.sleep(10000);
		System.out.println("................ Closed iframe marketing");

		WebElement tabMotorCredirLiElement = driver.findElement(By
				.cssSelector("li.tab-motor-credit > a"));

		if (tabMotorCredirLiElement.isEnabled()) {
			System.out
					.println(".......... ELEMENT:tabMotorCredirLiElement is Enabled");
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
				WebElement inputPass = driver.findElement(By
						.cssSelector("input#passwordSignIn"));
				inputPass.sendKeys("89060841356");
				// Button login action
				WebElement btnLogin = driver.findElement(By.id("btnLogin"));
				btnLogin.click();
				Thread.sleep(3000);

				// Select RadioButton
				Random r = new Random();
				Integer numClient = r.nextInt(2);
				if(numClient<=1) numClient = 1;
//				WebElement radioisClient1 = driver.findElement(By.id("isClient1"));
//				WebElement radioisClient1 = driver.findElement(By.id("isClient2"));

				WebElement radioisClient1 = driver.findElement(By.id("isClient" + numClient));
				
//				WebElement radioisClient1 = driver.findElement(By.id("isClient1"));
				radioisClient1.click();
				Thread.sleep(400);
				WebElement termsAndConditions = driver.findElement(By
						.id("termsAndConditions"));
				termsAndConditions.click();

				// Next ...
				WebElement btnNextStep = driver.findElement(By
						.cssSelector("button.next-button"));
				btnNextStep.click();

				WebElement primerApellido = driver.findElement(By
						.id("input_Apellido paterno"));
				primerApellido.sendKeys("Olivo");

				WebElement segundoApellido = driver.findElement(By
						.id("input_Apellido materno"));
				segundoApellido.sendKeys("Rojo");

				WebElement primerNombre = driver.findElement(By
						.id("input_Primer nombre"));
				primerNombre.sendKeys("rosa");

				WebElement segundoNombre = driver.findElement(By
						.id("input_Segundo nombre"));
				segundoNombre.sendKeys("jazmin");

				WebElement cedula = driver.findElement(By
						.id("input_C�dula de identidad"));
				cedula.sendKeys("1757208879");

				// WebElement civilStatus =
				// driver.findElement(By.cssSelector("div.inputContainer div.latam-dropdown a.latam-dropdown-button"));
				// civilStatus.click();
				// Thread.sleep(400);

				// WebElement civilStatusMarried =
				// driver.findElement(By.cssSelector("div.latam-dropdown-content.activedw div.over-item ul li:first-child"));
				// civilStatusMarried.click();
				selectedCivilStatus(driver);

				// Select objCasado = new Select(statusCasado) ;
				// objCasado.selectByVisibleText("CASADO");

				WebElement celular = driver.findElement(By.id("input_Celular"));
				celular.sendKeys("0984907867");

			} else {
				System.out
						.println(".......... ELEMENT:firstCardVehicleElement is Disabled");
			}

		} else {
			System.out
					.println(".......... ELEMENT: tabMotorCredirLiElement is Disabled");
		}

	}

	public static void selectedCivilStatus(WebDriver driver)
			throws InterruptedException {

		// Click dropdown
		WebElement civilStatus = driver
				.findElement(By
						.cssSelector("div.inputContainer div.latam-dropdown a.latam-dropdown-button"));
		civilStatus.click();
		Thread.sleep(400);

		// Click List Element Civil Status
		Random r = new Random();
		Integer indexSelected = r.nextInt(5);
		String cssSelectChild = "nth-child(" + indexSelected + ")";
		System.out.println(".......... Random: indexSelected = "
				+ indexSelected);
		if (indexSelected <= 1) {
			indexSelected = 1;
			cssSelectChild = "first-child";
		} else if (indexSelected >= 5) {
			indexSelected = 5;
			cssSelectChild = "last-child";
		}
		System.out.println(".......... Random: cssSelectChild = " + cssSelectChild);

		// WebElement civilStatusMarried = driver.findElement(By.cssSelector("div.latam-dropdown-content.activedw div.over-item ul li:first-child"));
		// WebElement civilStatusMarried = driver.findElement(By.cssSelector("div.latam-dropdown-content.activedw div.over-item ul li:nth-child(2)"));
		// WebElement civilStatusMarried = driver.findElement(By.cssSelector("div.latam-dropdown-content.activedw div.over-item ul li:nth-child(3)"));
		// WebElement civilStatusMarried = driver.findElement(By.cssSelector("div.latam-dropdown-content.activedw div.over-item ul li:nth-child(4)"));
		// WebElement civilStatusMarried = driver.findElement(By.cssSelector("div.latam-dropdown-content.activedw div.over-item ul li:last-child"));
		WebElement civilStatusMarried = driver
				.findElement(By
						.cssSelector("div.latam-dropdown-content.activedw div.over-item ul li:"	+ cssSelectChild));
		civilStatusMarried.click();
		Thread.sleep(1000);
		
		actionOnSelectedCivilStatus(driver, indexSelected);
		
		//Press next button

	}

	public static void actionOnSelectedCivilStatus(WebDriver driver, Integer indexSelected) throws InterruptedException {
		switch (indexSelected) {
		case 1:
			switchOnSelectedCivilStatus(driver);
			break;
		case 4:
			switchOnSelectedCivilStatus(driver);
			break;
		default:
			break;
		}
	}
	
	public static void switchOnSelectedCivilStatus(WebDriver driver) throws InterruptedException {
	
			WebElement primerApellido = driver.findElement(By
					.cssSelector("div.motorCredit-content div.content-row div:first-child div[data-reactid*='.$1'] input[id*='paterno']"));
			primerApellido.sendKeys("perez");

			WebElement segundoApellido = driver.findElement(By
					.cssSelector("div.motorCredit-content div.content-row div:first-child div:nth-child(2) input[id*='materno']"));
			segundoApellido.sendKeys("garcia");

			WebElement primerNombre = driver.findElement(By
					.cssSelector("div.motorCredit-content div.content-row div:first-child div:nth-child(2) input[id*='input_Primer']"));
			primerNombre.sendKeys("pedro");

			WebElement segundoNombre = driver.findElement(By
					.cssSelector("div.motorCredit-content div.content-row div:first-child div:nth-child(2) input[id*='input_Segundo']"));
			segundoNombre.sendKeys("jorje");

			WebElement cedula = driver.findElement(By
					.cssSelector("div.motorCredit-content div.content-row div:first-child div:nth-child(2) input[id*='input_C�dula']"));
			cedula.sendKeys("1757208879");
	
	}
}
