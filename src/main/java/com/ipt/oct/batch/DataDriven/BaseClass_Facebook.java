package com.ipt.oct.batch.DataDriven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_Facebook {
	
	public static WebDriver driver = null;
	
	public static WebDriver browserLaunch(String value) {

		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\eclipse-workspace\\Mini_Projects\\DriverF\\chromedriver.exe");

			driver = new ChromeDriver();	

		}else if (value.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		}else if (value.equalsIgnoreCase("gecko")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		return driver;		
	}
	
	public static void launchUrl (String Value) {
		driver.getCurrentUrl();
	}

	public static void userInputElement(WebElement element, String Value) {
		element.sendKeys(Value);	

	}

	public static void clickOnElement(WebElement element) {
		element.click();

}
	
	public static void userInputDetails(WebElement element, String Value) {
		element.sendKeys(Value);

	}
	
	public static void selectByValue(WebElement element, String Options, String Value) {
		
		Select s = new Select(element);
		if (Options.equalsIgnoreCase("Value")) {
			s.selectByValue(Value);
			
		}else if (Options.equalsIgnoreCase("Text")) {
			s.selectByVisibleText(Value);
						
		}else if (Options.equalsIgnoreCase("Index")) {
			int n = Integer.parseInt(Value);
		}
		
	}
	
	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static void navigateBack() {
		driver.navigate().back();
		
		}
	
	public static void screenShot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File ("C:\\Users\\vijay\\eclipse-workspace\\Mini_Projects\\Screenshots\\img.png");
		FileHandler.copy(from, to);
	}
	
	public static  void closeWindow() {
		driver.close();

	}
	
	public static void threadSleep() throws InterruptedException {
		Thread.sleep(4000);
	}
	}
