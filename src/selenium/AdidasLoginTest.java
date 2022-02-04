package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		
		Thread.sleep(4000);
		driver.findElement(By.id("login-email")).sendKeys("gagganvffg@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("dhdcvahd");
		
		
		driver.findElement(By.xpath("//button[@data-auto-id='login-form-login']")).click();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();

		
		Thread.sleep(4000);
		 String expectedErr ="Incorrect email/password – please check and retry";
		String actualErr= driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
	   System.out.println(actualErr);
	   
		 if(actualErr.equals(expectedErr)) {
			 System.out.println("Test pass");
		 }else {
			 System.out.println("test failed");
			 
			 driver.quit();
		 }
		 
		
	}

}
