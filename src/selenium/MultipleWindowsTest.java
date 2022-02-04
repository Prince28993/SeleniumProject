package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
     
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		Thread.sleep(3000);
		
		driver.findElement (By.linkText("also visit")).click();
		Thread.sleep(4000);

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());

		Iterator<String> iter = allWindows.iterator();
		String parentWindow = iter.next();
		String childwindow = iter.next();
		System.out.println(parentWindow);
		System.out.println(childwindow);

		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());//Reebok

		
		//driver.close(); //close only reebok
		//driver.quit();  // for all browser		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());//Adidas
		driver.quit();
		}
		}

