package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
         
		
		// yahoo list side trending xpath
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> headers=driver.findElements(By.xpath("//li[contains(@class,'trending-list')]//li"));
		
		System.out.println(headers.size());
		//for(int i=0; i<headers.size();i++) {
			//System.out.println(headers.get(i).getText());
			
			for (WebElement a : headers) {
				System.out.println(a.getText());
			}
	}
	


}
