package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HowToFindFooters {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> footers=driver.findElements(By.xpath("//div[@id='pageFooterChildren']//a"));
		System.out.println(footers.size());
		
		for(int i=0; i<footers.size();i++){
        System.out.println(footers.get(i).getText());
		}


	}
}
