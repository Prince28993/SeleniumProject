package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radioButtons = driver.findElements(By.name("group1"));
		System.out.println(radioButtons.size());
		
		for(WebElement a : radioButtons) {
			//System.out.println(a.getAttribute("value"));
			System.out.println(a.getAttribute("value")+"--------"+a.isSelected());
		}
		
         radioButtons.get(2).click();
         System.out.println("=-----------------------------------=");
         
         for(WebElement a : radioButtons) {
 			//System.out.println(a.getAttribute("value"));
 			System.out.println(a.getAttribute("value")+"--------"+a.isSelected());
 			

	}
         
}
}

