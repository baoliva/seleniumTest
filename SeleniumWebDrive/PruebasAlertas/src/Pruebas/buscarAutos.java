package Pruebas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class buscarAutos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\blankyliv\\Desktop\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ecuador.patiotuerca.com/ptx/");
		
		Thread.sleep(10000);
		//writing search chevrolet autos
		WebElement buscarChevrolet = driver.findElement(By.id("search-list"));
		buscarChevrolet.sendKeys("chevrolet autos");
		
		//click on button search
		WebElement buttonSearch = driver.findElement(By.cssSelector("div.search-wrapper i.material-icons"));
		buttonSearch.click();
		
		// price from
		WebElement priceFrom = driver.findElement(By.id("from_price"));
		priceFrom.sendKeys("10000");
		
		//price up to
		WebElement priceUpTo = driver.findElement(By.id("to_price"));
		priceUpTo.sendKeys("15000");
		
		WebElement buttonPrice = driver.findElement(By.cssSelector("div.filter-input div.input-btn a.btn "));
		buttonPrice.click();
				
		//years from
		WebElement yearsFrom = driver.findElement(By.id("from_year"));
		yearsFrom.sendKeys("2010");
		
		//years to up
		WebElement yearsUpTo = driver.findElement(By.id("to_year"));
		yearsUpTo.sendKeys("2017");
		
		WebElement buttonYears = driver.findElement(By.id("btn-year-filter"));
		buttonYears.click();
		
		//obtener primer elemento de la lista de autos
		//WebElement element = driver.findElement(By.cssSelector("div.usedList #featuredUsed article:first-child div.card-image > a "));
		//element.click();
		WebElement element = driver.findElement(By.cssSelector("div.usedList #featuredUsed article:nth-child(2) div.card-image > a "));
		element.click();
		
		
	}

}
