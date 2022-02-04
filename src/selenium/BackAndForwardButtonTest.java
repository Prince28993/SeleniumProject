package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForwardButtonTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
	     FirefoxDriver driver = new FirefoxDriver();// open firefox
	     driver.get("https://www.google.com/"); 

	     driver.findElement(By.linkText("About")).click();
	   		Thread.sleep(3000);
	   		System.out.println(driver.getTitle()); //about page title
	   		
	   		driver.navigate().back();
	   		Thread.sleep(4000);
	   		System.out.println(driver.getTitle());//google tile
	   		
	   		driver.navigate().forward();
	   		Thread.sleep(4000);
	   		System.out.println(driver.getTitle());// a bout page title
	}

}
