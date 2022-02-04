package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
				// enter wrong email 
				//verify error message	
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=accountsettings&passive=1209600&osid=1&continue=https%3A%2F%2Fmyaccount.google.com%2Fintro%2Fsigning-in-to-google&followup=https%3A%2F%2Fmyaccount.google.com%2Fintro%2Fsigning-in-to-google&ec=GAZAwAE&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.id("identifierId")).sendKeys("zdzdcsdc");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		Thread.sleep(4000);

		String expectedErr = "Couldn't find your Google Account";
		String actualErr = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println(actualErr);
		
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("Test Passed");
		
		}else {
		System.out.println("Test Failed");
		
	}

	}

}
