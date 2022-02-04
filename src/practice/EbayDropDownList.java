package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayDropDownList {

	public static void main(String[] args) throws InterruptedException {

		//div[@id='region-select-popover-container']//li
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> ebayDropdownlist = driver.findElements(By.xpath("//div[@id='gh-cat-box']//option"));
		System.out.println(ebayDropdownlist.size());
		
		for(int i =0;i<ebayDropdownlist.size();i++) {
			System.out.println(ebayDropdownlist.get(i).getText()+"---------"+ebayDropdownlist.get(i).isSelected());
		}
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select  s = new Select(box);
		Thread.sleep(2000);
		s.selectByIndex(7);
		
		for(int i =0;i<ebayDropdownlist.size();i++) {
			System.out.println(ebayDropdownlist.get(i).getText()+"---------"+ebayDropdownlist.get(i).isSelected());
		}
		
		s.selectByValue("11116");
	}

}
