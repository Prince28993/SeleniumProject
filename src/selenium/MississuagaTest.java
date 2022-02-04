package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississuagaTest {

	public static void main(String[] args) throws InterruptedException {
 
		 
         System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
         FirefoxDriver driver = new FirefoxDriver();
          driver.get("https://www.mississauga.ca/");
     
          driver.findElement(By.xpath("//ul[@class='main-nav-links']/li[3]/button")).click();
          Thread.sleep(4000);
          
          List<WebElement> all = driver.findElements(By.xpath("//ul[@class='main-nav-links']/li[3]//a"));
          System.out.println(all.size());
          
          for(WebElement a : all) {
        	  System.out.println(a.getText());
        	 Thread.sleep(4000);
        	   if(a.getText().equals("Jobs and volunteer") ){
             	  a.click();
             	  Thread.sleep(2000);
             	  System.out.println(driver.getTitle());
             	  break;
        	   }
           }
          
	}

}
