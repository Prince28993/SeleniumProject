package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTableDataTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));	
		System.out.println(rows.size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']//th"));	
		System.out.println(column.size());
		
		
		for(int i=1;i<rows.size();i++) {
			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++) {
				System.out.print(cols.get(j).getText());
				System.out.print(" | ");

			}
			System.out.println("");
		
		}
	}
}
