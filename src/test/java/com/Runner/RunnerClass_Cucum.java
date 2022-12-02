package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\eclipse-workspace\\Facebook_Project\\src\\test\\java\\com\\Feature\\Facebook.feature",
glue = "com.Stepdefinition")
public class RunnerClass_Cucum {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
			
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\Facebook_Project\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@AfterClass
	public static void tearDown() {
		
		driver.close();

	}

}
