package TestCasesforLambdatest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Objectclasses.LoginScreenObjects;

public class LoginClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\Desktop\\Prabha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/automation-demos/");
		driver.manage().window().maximize();
		
		LoginScreenObjects.Username(driver).sendKeys("lambda");
		LoginScreenObjects.Password(driver).sendKeys("lambda123");
		LoginScreenObjects.LoginButton(driver).click();
		
		
		
	}

}
