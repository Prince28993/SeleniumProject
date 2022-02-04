package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//max seconds
	//Thread.sleep(5200); fix seconds
		driver.findElement(By.linkText("Create new account")).click();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("singh");

			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("singh");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("4379292466");
			driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("hjvhsjhxah");
			
			WebElement month = driver.findElement(By.id("month"));
			Select m = new Select(month);
			m.selectByValue("7");
			
			
			WebElement day = driver.findElement(By.id("day"));
			Select d = new Select(day);
			d.selectByValue("15");
			
			
			WebElement year = driver.findElement(By.id("year"));
			Select y = new Select(year);
			y.selectByValue("2020");
			
			
			driver.findElement(By.name("websubmit")).click();

			
			}
				
			}

