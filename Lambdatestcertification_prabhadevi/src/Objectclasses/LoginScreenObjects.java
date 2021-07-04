package Objectclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class LoginScreenObjects {
			
	public static WebElement Username(WebDriver driver) {
		return driver.findElement(By.id("username")); 
	}
		

	public static WebElement Password(WebDriver driver) {
			return driver.findElement(By.id("password")); 	
	}

	public static WebElement LoginButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'newapply\']/div[3]/button")); 	
}	
		

}
