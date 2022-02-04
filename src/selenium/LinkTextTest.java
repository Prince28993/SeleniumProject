package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		//classs name objname = new classname();
		FirefoxDriver driver = new FirefoxDriver();// open firefox
		driver.get("https://www.google.com/"); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver,20);// max seconds

   		driver.findElement(By.partialLinkText("About")).click();
   		
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
   		
   		String exptedTitle = "Google - About Google, Our Culture & Company News";
   		String actualTitle = driver.getTitle();
   		System.out.println(actualTitle);
   	
   		String expectedUrl = "https://about.google";
   		String actualUrl = driver.getCurrentUrl();
   		System.out.println(actualUrl);
   		
   		if(exptedTitle.equals(actualTitle)  && actualUrl.contains(expectedUrl)) {
   			System.out.println("Test Passed");
   		}else {
   			System.out.println("Test Failed");
   			
   			
   			
   		}


	}

}
