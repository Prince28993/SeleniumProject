package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser ="Firefox";//chrome,safari//code will read this value from dara file such as excel.properties file
		WebDriver driver;
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			 driver = new FirefoxDriver();  
			} else if(browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
				 driver = new ChromeDriver();  
			}else {
				System.setProperty("webdriver.safari.driver", "C:\\SeleniumJars\\csafaridriver.exe");
				 driver = new SafariDriver();  
			}
			
			driver.get("https://www.facebook.com/");  
			
			driver.findElement(By.id("email")).sendKeys("sdgsdfuyhsfdgsyheytty"); 
			driver.findElement(By.id("pass")).sendKeys("sdgsahdgasgsd"); 
			driver.findElement(By.name("login")).click();

	}

}
