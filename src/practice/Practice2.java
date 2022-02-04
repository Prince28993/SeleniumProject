package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=vG27LC7xe-s&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoidkcyN0xDN3hlLXMiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYzNjkxNzQyMCwiaWF0IjoxNjM2OTE2MjIwLCJqdGkiOiIzYTg1MzQ2ZC03YWY0LTQ5OWQtYjkxNi0xMTlmOGM5YmUzYTAiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.IaLAtmjnIP4IjeAq8kTzlOQEQNftxPp8I0vLctoz_K6Y9briHYxrsB58ylQEgv9lhWWvBm40QZMOVDmiv1ICmmPVed5988NacMoTBrjpKrZt2TM5e2gxu66OZMC0wESGNUzEUqL2_X-gX7XVkNJRt6FLO_Lvatbz-BrzS4NPeC-OIqLaH53YVI3jGit4zn_0t7KNN7QptMtxOf1_8MKYDgft8TZaJVWFA0w3hx-gfF9fgzJpYukAGIg69gf7wkTaJlpFVutsQH5cLsb9TcRMVa25iP8bGaYjp0X-zMyb7Lyr3vLfTHhjqy0OcnaGsoOpI8FkPhiPzof-GS-q3BZ-iQ&preferred_environment=");
		
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("gagan");
		driver.findElement(By.id("password-input")).sendKeys("dhjadhj");

		String s = driver.findElement(By.id("usernameInput-input")).getAttribute("value");
		System.out.println(s);
		
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(4000);
		
		String actualErr ="Please check your card number / username or password and try again.";
		String expectedErr = driver.findElement(By.id("globalError")).getText();
		
		
		if(actualErr.equals(expectedErr)) {
			
			System.out.println("Test pass");
			
		}
		else {
			System.out.println( "test failed");
		}
	}

}
