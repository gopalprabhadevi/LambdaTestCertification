package TestCasesforLambdatest;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Objectclasses.LambaTestpageObjects;
import Objectclasses.LoginScreenObjects;
import Objectclasses.RegistrationPageObjects;




public class RegistrationPage {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\Desktop\\Prabha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/automation-demos/");
		driver.manage().window().maximize();
		LoginScreenObjects.Username(driver).sendKeys("lambda");
		LoginScreenObjects.Password(driver).sendKeys("lambda123");
		LoginScreenObjects.LoginButton(driver).click();
		
		
		
		RegistrationPageObjects.EmailBox(driver).sendKeys("prabhadevi-g@hcl.com");
		RegistrationPageObjects.PopulateButton(driver).click();
		Alert AlertBox = driver.switchTo().alert();
		AlertBox.accept();
		
		RegistrationPageObjects.Question1RadioBtn(driver).click();
		RegistrationPageObjects.Question2CheckBox1(driver).click();
		RegistrationPageObjects.Question2CheckBox2(driver).click();
		RegistrationPageObjects.Question2CheckBox3(driver).click();
		RegistrationPageObjects.Question3Dropdown(driver).sendKeys("Wallets");
		RegistrationPageObjects.Question4Checkbox(driver).click();
				
		Actions ac = new Actions(driver);
		ac.clickAndHold(RegistrationPageObjects.ScaleBox(driver)).moveToElement(RegistrationPageObjects.ScaleBoxSelect(driver)).release().build().perform();
		
		RegistrationPageObjects.FeedBackbox(driver).sendKeys("Completed Successfully");	
		JavascriptExecutor js=((JavascriptExecutor)driver);
		(js).executeScript("window.open()");
		ArrayList<String> TabsUrl=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(TabsUrl.get(1));
		driver.get("https://www.lambdatest.com/selenium-automation/");
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(LambaTestpageObjects.JenkinImage(driver)));
		js.executeScript("window.scrollBy(0,4000)");
		ac.contextClick(LambaTestpageObjects.JenkinImage(driver)).build().perform();
		
				
		try {
			Robot Saveimg =new Robot();
			
			
			Saveimg.keyPress(KeyEvent.VK_S);
			
			Saveimg.keyPress(KeyEvent.VK_SHIFT);
			Saveimg.keyPress(KeyEvent.VK_SEMICOLON);
			Saveimg.keyRelease(KeyEvent.VK_SHIFT);
			
			Saveimg.keyPress(KeyEvent.VK_BACK_SLASH);
			
			Saveimg.keyPress(KeyEvent.KEY_PRESSED);
			
			
		
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}
	

}
