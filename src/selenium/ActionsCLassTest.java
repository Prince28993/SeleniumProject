package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCLassTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder =new Actions(driver);
		builder.moveToElement(electronics).build().perform();
		 
		Thread.sleep(2000);
		
		//size and text for top categories
		
		List<WebElement> all = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
		System.out.println(all.size());
		
		for(WebElement a : all) {
			System.out.println(a.getText());
		}
		//nav[@aria-label='More Categories']//ul/
		
		//List<WebElement>  = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
		System.out.println(all.size());
		
		for(WebElement a : all) {
			System.out.println(a.getText());
			driver.quit();		}

	}

}
