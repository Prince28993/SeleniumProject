package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
      
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	
	
	
	//click on create a new account
		driver.findElement(By.linkText("Create new account")).click();
		//a[contains(@id,'u_0_2')]
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("singh");

			//enter lastname
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("singh");
			//enter any 10 digit mobile number
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("4379292466");
			//enter password
			driver.findElement(By.name("reg_passwd__")).sendKeys("hjvhsjhxah");
			
			//Select July
			Thread.sleep(3000);
			WebElement month = driver.findElement(By.id("month"));
			Select m = new Select(month);
			m.selectByValue("7");
			
			//Select 15
			
			Thread.sleep(3000);
			WebElement day = driver.findElement(By.id("day"));
			Select d = new Select(day);
			d.selectByValue("15");
			//Select 2020
			
			
			Thread.sleep(3000);
			WebElement year = driver.findElement(By.id("year"));
			Select y = new Select(year);
			y.selectByValue("2020");
			
			
			Thread.sleep(3000);
			//click on SignUP button
			driver.findElement(By.name("websubmit")).click();

			driver.close();
			
			
			
}

}