
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;




public class TestAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       WebDriver driver = new FirefoxDriver(); 
       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

       driver.manage().window().maximize();       
       driver.get("http://www.ksrtc.in/oprs-web/guest/home.do?h=1");
       
       System.out.println("................ antes del sleep");
       Thread.sleep(3000);
       System.out.println("................ despues del sleep");

//       WebElement element = driver.findElement(By.id("searchBtn"));
//       
//
//       WebElement elementfromPlaceName = driver.findElement(By.id("fromPlaceName"));
//       elementfromPlaceName.sendKeys("234565432345");
//       
//       if(element.isEnabled()) {
//    	    System.out.println(".......... ELEMENT: Enabled");
//    	    element.click();
//    	}else{
//    	    System.out.println(".......... ELEMENT: Disabled");
//    	}
    assertEquals("Search for  Bus", driver.findElement(By.id("searchBtn")).getAttribute("value"));
   
    driver.findElement(By.xpath("//input[@id='searchBtn']")).click();	   
       

//       driver.findElement(By.id("searchBtn")).submit();
//         Alert alert = driver.switchTo().alert();
//         alert.accept(); 
//       String msg_actual=driver.switchTo().alert().getText();
//       System.out.println("Alert message is"+msg_actual);
//       driver.switchTo().alert().accept();
//		
//       String expend_msg = "'From' place is required please update the same";
//       
//       Assert.assertEquals(msg_actual, expend_msg);

	}

}
