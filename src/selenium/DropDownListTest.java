package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		
		List<WebElement> dropdownList=driver.findElements(By.xpath("//select[@id='gh-cat']//option"));
		System.out.println(dropdownList.size());
		
		for(int i=0; i<dropdownList.size();i++) {
			System.out.println(dropdownList.get(i).getText()+"-----"+dropdownList.get(i).isSelected());
		}
		//select[@id='gh-cat']//option
		
		WebElement box = driver.findElement(By.id("gh-cat"));
		
		Select  s = new Select(box);
		
		s.selectByIndex(2);
		Thread.sleep(4000);
		
		s.selectByValue("2984");
		Thread.sleep(4000);
		
		s.selectByVisibleText("Books");
		for(int i=0; i<dropdownList.size();i++) {
			System.out.println(dropdownList.get(i).getText()+"-----"+dropdownList.get(i).isSelected());
		}
		
		
	}

}
