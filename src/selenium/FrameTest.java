package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("element present");
		}else {
			System.out.println("element not present");
		}
		//WebElement second= driver.findElement(By.xpath("//div[@id='draggable']//p"));
		List<WebElement> draggable = driver.findElements(By.id("draggable"));
        System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("element present");
		}else {
			System.out.println("element not present");
	    }
		driver.switchTo().frame(0); //switch to by index
		//driver.switchTo().frame("demo-frame"); //this option only work when we have id or name .in this case we cannot use
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));//using web element
		System.out.println("---------------------------after switching to the frame--------------");
		

		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if(sortable.size()>0) {
			System.out.println("element present");
		}else {
			System.out.println("element not present");
		}
		//WebElement second= driver.findElement(By.xpath("//div[@id='draggable']//p"));
		draggable = driver.findElements(By.id("draggable"));
        System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("element present");
		}else {
			System.out.println("element not present");
	    }
		
		driver.switchTo().defaultContent();
            System.out.println("---------------------------after switching to the  main frame--------------");
		

		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if(sortable.size()>0) {
			System.out.println("element present");
		}else {
			System.out.println("element not present");
		}
		//WebElement second= driver.findElement(By.xpath("//div[@id='draggable']//p"));
		draggable = driver.findElements(By.id("draggable"));
        System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("element present");
		}else {
			System.out.println("element not present");
	    }
	}


	}


