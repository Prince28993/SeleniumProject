package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
 //heading on top all headers
		//div[@id='ybar-navigation']//a
		////ul[contains(@class,'_yb_lz2g5 _yb_k5te4')]//li
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> headers=driver.findElements(By.xpath("//div[@id='ybar-navigation']//a"));
		
		System.out.println(headers.size());
		for(int i=0; i<headers.size();i++) {
			System.out.println(headers.get(i).getText());
	}

}
}
