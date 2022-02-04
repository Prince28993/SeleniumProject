package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
            
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
	     FirefoxDriver driver = new FirefoxDriver();// open firefox
	     driver.get("https://jqueryui.com/droppable/"); 
	     driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//
	     Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver,20);
	     driver.switchTo().frame(0); //switch to by index

	     WebElement draggable = driver.findElement(By.id("draggable"));
	    
	     
	     WebElement droppable = driver.findElement(By.id("droppable"));
	     
	    Actions builder =new Actions(driver);
		builder.dragAndDrop(draggable,droppable).build().perform();
			wait.until(ExpectedConditions.textToBePresentInElement(droppable,"Dropped!"));
			
			String verify =driver.findElement(By.id("droppable")).getText();
			if (verify.equals("Dropped!")) {
				System.out.println("dropped");
			}
			else {
				System.out.println("not dropped");
			}
			driver.quit();

	}

}
