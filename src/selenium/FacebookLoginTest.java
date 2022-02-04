package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//Enter email
		//1.ClassName - this is not working
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("vxffcdcjhfhj"); //When we have space in the classname,we can not use directly .it will not work
        
		//2.CssSelector - right now we dont know css , so we can not use
		//driver.findElement(By.cssSelector(null)); 
		
		//3.id -working
		driver.findElement(By.id("email")).sendKeys("dsvfzdfgdsfgfdgsfd");
		
		//4.LinkText Not Working
		//driver.findElement(By.linkText(null)).sendKeys("rattuji"); //This option we use only for links
		
		//5.Name - working
		driver.findElement(By.name("email")).sendKeys("rattuji");
		
		//6.partialLinktext  - Not Working
		//driver.findElement(By.partialLinkText(null)); //this option we use only for links
		
		//7.tagname Not Working
		//driver.findElement(By.tagName("input")).sendKeys("gaganji"); // not unique
		
		//8.xpath Not Working
		//driver.findElement(By.xpath(null)); // we need to learn xpath.needs to remember xpath syntax
		
		//enter password
		driver.findElement(By.name("pass")).sendKeys("ghf");
		
		//login button
		driver.findElement(By.name("login")).click();
		
	}

}
