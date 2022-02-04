package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("		https://auth.scotiaonline.scotiabank.com/online?oauth_key=bLqQz-977Ow&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiYkxxUXotOTc3T3ciLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYzNjMyMzUwNCwiaWF0IjoxNjM2MzIyMzA0LCJqdGkiOiI0YTI3Yzk5OS1hNDljLTQyNTktYWZjYi02MjUwOGQ5ZWI3NzUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.k_EBzAQqeR9aOyVIX8J1AQbxV_cwAMqxUbhGZSRhz7-RruyPKM_ou3l6MDfFacqZvel4wYLYwqUi6qlqXc1AN_rxy2YOwQfD0468GltfOFRq2rmU9qEevamxhzZ3aXJPquVDt8MAXfr7X8D_yWj0GRb3otbB3Go7-NtmYy1VrIv05bFYn8VxQmDS_VVwKlA2FNd1eASFDlVYRVshH6HwyA7kgryM__MkGoZ0ogMbDPHJkvMTLLj7-CuwIjEIF03EEJpYpqN9-9snGw5gz5SSs0fMfOKCtaOyA_n-11TNfFYUpcf2Tc91X6XAK3n_H0ikQcWWy2DOf6gvRDKiUwQZaA&preferred_environment=\r\n"
				+ "");
		
		
      //enter wronng email
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("gagan");
		//enter wrong password
		
		driver.findElement(By.id("password-input")).sendKeys("bootcamp");
		driver.findElement(By.id("password-input")).sendKeys(Keys.ENTER); //for enter button to login instead of click n signin button 2nd way
		
		//click on signin button
		//driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(4000);
		
		String expectedErr = "Please check your card number / username or password and try again.";
		String actualErr = driver.findElement(By.id("globalError")).getText();
		System.out.println(actualErr);
		
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("Test Passed");
		
	   }else {
		System.out.println("Test Failed");
		
	}

}
}
