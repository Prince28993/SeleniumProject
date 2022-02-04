package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		//ali express 
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		//if u get the popup ---> type computer in search box
		//if you dont get the popup ===> type computer in the search box
		
		//img[@class='btn-close'] 
		
		
		
		List<WebElement> element =driver.findElements(By.xpath("//img[@class='btn-close']"));
		System.out.println(element.size());
		if(element.size()>0) {
			System.out.println("element present");
			element.get(0).click();
		
			driver.findElement(By.xpath("//input[@id='search-key']")).sendKeys("Computer");

		}else {
			System.out.println("element not present");
			driver.findElement(By.xpath("//input[@id='search-key']")).sendKeys("Computer");

		}
		
		//img[@class='_24EHh']
		List<WebElement> secondpopup =driver.findElements(By.xpath("//img[@class='_24EHh']"));
		System.out.println(secondpopup.size());
		if(secondpopup.size()>0) {
			secondpopup.get(0).click();
			
		}
		
	}

}
