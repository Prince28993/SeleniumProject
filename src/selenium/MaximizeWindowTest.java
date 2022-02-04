package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		 
	    driver.findElement(By.id("email")).sendKeys("gfhffyfydjyj");// type wrong email in emal box
	    driver.findElement(By.id("pass")).sendKeys("fgsdfsdfa"); // type wrong password
	    driver.findElement(By.name("login")).click();
	}

}
