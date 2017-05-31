package SeleniumPruebas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LocatingStrategie {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Create firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		
		// Open Indeed home page
		driver.get("https://www.indeed.co.uk");
		
		// Locating By Id
		//driver.findElement(By.id("what")).sendKeys("Selenium");
				
		// Locating By Name
		//driver.findElement(By.name("q")).sendKeys("Selenium");	
		
		// Locating By LinkText
		//driver.findElement(By.linkText("Upload your CV")).click();
		
		// Locating By PartialLinkText
		//driver.findElement(By.partialLinkText("Post Job")).click();
		
		// Locating By Xpath
		//driver.findElement(By.xpath("//img[@title='Indeed job search']")).getAttribute("src");		
		//System.out.println(driver.findElement(By.xpath("//img[@title='Indeed job search']")).getAttribute("src"));
		
		// Locating By cssSelector
		//driver.findElement(By.cssSelector("input.input_submit")).getAttribute("value");
		//System.out.println(driver.findElement(By.cssSelector("input.input_submit")).getAttribute("value"));	
		
		// Locating By TagName
	//	System.out.println(
		//		driver.findElement(By.tagName("a")).getText());
//		System.out.println(
		//	driver.findElement(By.tagName("a")).getSize());
		
		// Locating By ClassName		
	System.out.println(
			driver.findElement(By.className("input_text")).getSize());
		driver.findElement(By.className("input_text")).sendKeys("Selenium");
		
		
		
		
				
		
		
		
	}
	

}
