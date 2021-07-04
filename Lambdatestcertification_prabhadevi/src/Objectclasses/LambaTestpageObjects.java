package Objectclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LambaTestpageObjects {
	
	public static WebElement JenkinImage(WebDriver driver) {
		return driver.findElement(By.xpath("//img[@title='Jenkins']"));
	}
	

}
