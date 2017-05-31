package SeleniumPruebas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Create firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		
		// Open Indeed home page
		//Thread.sleep(2000);
		driver.get("https://www.indeed.co.uk");
		
		// Find what field and enter Selenium
				Thread.sleep(2000);
				driver.findElement(By.id("what")).sendKeys("Selenium");
				
				// Find location field and enter London
				driver.findElement(By.id("where")).clear();
				Thread.sleep(2000);
				driver.findElement(By.id("where")).sendKeys("London");
				
				// Find FindJob button and click on it
				Thread.sleep(2000);
				driver.findElement(By.id("fj")).click();
				
				// From job search result page, get page title and jobs count message
				System.out.println(driver.getTitle());
				System.out.println(driver.findElement(By.id("searchCount")).getText());
			
				driver.close();
	}

}
