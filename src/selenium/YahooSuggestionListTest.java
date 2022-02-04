package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/"); 
	
		driver.findElement(By.name("p")).sendKeys("canada");
		
		Thread.sleep(4000);

		List<WebElement> elements = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println(elements.size());
		
		  for(WebElement a : elements) {
	    	  System.out.println(a.getText());
	    	  
		  }
	}

	}