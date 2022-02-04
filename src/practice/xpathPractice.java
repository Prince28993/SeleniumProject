package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class xpathPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			
	     driver.get("https://www.facebook.com/"); 
		
	     Thread.sleep(4000);
	   //click on create a new account
			driver.findElement(By.linkText("Create new account")).click();
			Thread.sleep(4000);
			driver.findElement(By.name("firstname")).sendKeys("GAGAN");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("singh");
			driver.findElement(By.name("reg_email__")).sendKeys("4379292466");
			driver.findElement(By.name("reg_passwd__")).sendKeys("hjvhsjhxah");

			WebElement day = driver.findElement(By.id("day"));
			Select d = new Select(day);
			d.selectByValue("28");
			
			Thread.sleep(3000);
			WebElement month = driver.findElement(By.id("month"));
			Select m = new Select(month);
			m.selectByValue("9");
			
			Thread.sleep(3000);
			WebElement Year = driver.findElement(By.id("year"));
			Select y = new Select(Year);
			y.selectByValue("1993");
			
			List<WebElement> radioButtons = driver.findElements(By.name("radio"));
			System.out.println(radioButtons.size());
			
	}

}
