package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
     FirefoxDriver driver = new FirefoxDriver();// open firefox
     driver.get("https://www.google.com/"); 
     
     //canada
     driver.findElement(By.name("q")).sendKeys("Canada");
     Thread.sleep(4000);
      List<WebElement> elements = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
      System.out.println(elements.size());
	
      for(WebElement a : elements) {
    	  System.out.println(a.getText());
    	  
    	  //for(int i=0; i<elements.size();i++) {
  			//System.out.println(elements.get(i).getText());
    	  driver.quit();
      
      
     
	}
	}
}
