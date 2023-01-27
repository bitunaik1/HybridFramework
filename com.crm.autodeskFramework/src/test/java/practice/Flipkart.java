package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.autodesk.genericutility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
@Test(enabled = true)
public void flipkart() throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	String productName="APPLE iPhone 12 (Green, 128 GB)";
	driver.get("https:www.google.com");

	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	Thread.sleep(6000);
	System.out.println(driver.getTitle());
	Thread.sleep(4000);
new WebDriverUtility().clearBrowserHistory(driver);
////	Set<String> allSessionId = driver.getWindowHandles();
//	Iterator<String> it=allSessionId.iterator();
//	while(it.hasNext()) {
//		String is=it.next();
//		if(driver.getTitle().contains("history")) {
//			break;
//		}
//	}
//	Thread.sleep(2000);
//	String clear="return document.querySelector('settings-ui').shadowRoot.querySelector('#main').shadowRoot.querySelector('settings-basic-page').shadowRoot.querySelector('#basicPage > settings-section:nth-child(9) > settings-privacy-page').shadowRoot.querySelector('settings-clear-browsing-data-dialog').shadowRoot.querySelector('#clearBrowsingDataConfirm')";
//	
//	JavascriptExecutor jse=(JavascriptExecutor)driver;
//	WebElement wb = (WebElement)jse.executeScript(clear);
//	wb.click();
	
	
	
//	driver.findElement(By.xpath("//button[text()='✕']")).click();
//	driver.findElement(By.name("q")).sendKeys("iphone 12", Keys.ENTER);
//	WebElement price=driver.findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
//	System.out.println(price.getText());
//	WebElement offer=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Green, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_3xFhiH']"));
//	System.out.println(offer.getText());

}
}
