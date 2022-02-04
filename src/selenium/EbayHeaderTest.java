package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/s");
		
		
		
		List<WebElement> headers=driver.findElements(By.xpath("//ul[@id='gh-topl']//a"));
		System.out.println(headers.size());
		
		for(int i=0; i<headers.size();i++){
        System.out.println(headers.get(i).getText());
		}
                      
	}

}
