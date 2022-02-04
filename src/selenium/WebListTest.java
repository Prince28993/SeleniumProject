package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		// WebElement firstlink = driver.findElement(By.tagName("a"));
		//List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		//System.out.println(allLinks.size());
	    
		//for(int i=0; i<allLinks.size();i++) {
			//System.out.println(allLinks.get(i).getText());
		//}
		//1. first way of getting footer <a> list
		// WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));
		//List<WebElement> footers=footer.findElements(By.tagName("a"));

		   //second way of geeting footer
			List<WebElement> footers=driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
			
			System.out.println(footers.size());
			for(int i=0; i<footers.size();i++) {
				System.out.println(footers.get(i).getText());
			}
			
		//div[@class='KxwPGc SSwjIe']
	}

}
