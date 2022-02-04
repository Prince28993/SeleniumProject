package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		
		//driver.findElement(By.xpath("//input[@name='B2']")).click();
		driver.findElement(By.name("B2")).click();
		
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept(); //click on seleceted one
		//al.dismiss(); //click on other button unselected one
	}

}
