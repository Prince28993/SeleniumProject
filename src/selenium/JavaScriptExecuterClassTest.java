package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
          

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		
			Thread.sleep(4000);
			
			JavascriptExecutor	 jse =(JavascriptExecutor)driver;
			WebElement career  = driver.findElement(By.linkText("Careers"));
			
			//Option1 -scroll by x and y coordinates
			
			//System.out.println(career.getLocation());
			//jse.executeScript("window.scrollBy(0,4000");
			//career.click();
		
		 //option 2 - scroll until elemet is in the view is true
			//jse.executeScript("argument[0].scrollIntoView(true);",career);
         //career.click();
			
			//option 3 - direct click using JavaScriptExecuter  class
			jse.executeScript("argument[0].click()0",career);
			
			}

			}
