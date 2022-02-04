package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		//go to men section and then get size and text of 2nd column
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		
		WebElement men = driver.findElement(By.linkText("Men"));
		Actions builder =new Actions(driver);
		builder.moveToElement(men).build().perform();
		
		Thread.sleep(4000);
		
		List<WebElement> mens = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
		System.out.println(mens.size());
		
		for(WebElement a : mens) {
			
			System.out.println(a.getText());
		}
		
	}
	
    
}
