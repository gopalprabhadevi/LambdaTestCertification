package Objectclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPageObjects {
	
	public static WebElement EmailBox(WebDriver driver) {
		return driver.findElement(By.id("developer-name"));
	}
	
	public static WebElement PopulateButton(WebDriver driver) {
		return driver.findElement(By.id("populate"));
	}
	public static WebElement Question1RadioBtn(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'__next\']/div[1]/section[2]/div/div/div[1]/p[3]/label"));
	}
	
	public static WebElement Question2CheckBox1(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'__next\']/div[1]/section[2]/div/div/div[2]/p[1]/label"));
	}
	public static WebElement Question2CheckBox2(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'__next\']/div[1]/section[2]/div/div/div[2]/p[2]/label"));
	}
	public static WebElement Question2CheckBox3(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'__next\']/div[1]/section[2]/div/div/div[2]/p[3]/label"));
	}
	public static WebElement Question3Dropdown(WebDriver driver) {
		return driver.findElement(By.id("preferred-payment"));
	}
	public static WebElement Question4Checkbox(WebDriver driver) {
		return driver.findElement(By.id("tried-ecom"));
	}
	public static WebElement ScaleBox(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'__next\']/div[1]/section[2]/div/div/div[4]/div[2]/div/div/div[1]/div/div[12]"));
		
	}
	public static WebElement ScaleBoxSelect(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='__next']/div[1]/section[2]/div/div/div[4]/div[2]/div/div/div[1]/div/div[10]"));
	}
	
	public static WebElement FeedBackbox(WebDriver driver) {
		return driver.findElement(By.id("comments"));
	}
}
	


