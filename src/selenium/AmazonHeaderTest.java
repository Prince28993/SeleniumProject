package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	public static void main(String[] args) throws InterruptedException {

		//headr  link on top.
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca");
		
		List<WebElement> headers=driver.findElements(By.xpath("//div[@id='nav-xshop']//a"));
		Thread.sleep(4000);
		System.out.println(headers.size());
		for(int i=0; i<headers.size();i++) {
			System.out.println(headers.get(i).getText());
			driver.quit();
//		}
//		for(WebElement b : headers) {
//			System.out.println(b.getText());
		}
	}

}
