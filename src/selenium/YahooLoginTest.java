package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.intl=in");
		
//		driver.findElement(By.id("login-username")).sendKeys("cdvvsdvvs@yahoo.ca");
//		driver.findElement(By.id("login-signin")).click();
//		
//		Thread.sleep(4000);
//		String s = "Sorry, we don't recognise this email address.";
//		String a = driver.findElement(By.id("username-error")).getText();
//		System.out.println(a);
//		
//		 if(s.equals(a)) {
//			 System.out.println("Test pass");
//		 }else {
//			 System.out.println("test failed");
//		 }
		  
		 driver.findElement(By.id("login-username")).sendKeys("cdvvsdvvs@yahoo.ca");
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Thread.sleep(4000);
		 
		 String s = "Sorry, we don't recognise this email address.";
		 String a = driver.findElement(By.xpath("//p[@class='error-msg']")).getText();
		 System.out.println(a);
		 
		 if(s.equals(a)) {
		 System.out.println("Test pass");
		 }else {
		 System.out.println("test failed");
	 }

	}

}
