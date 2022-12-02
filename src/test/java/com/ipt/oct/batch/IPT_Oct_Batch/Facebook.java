package com.ipt.oct.batch.IPT_Oct_Batch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\Facebook_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Actions a = new Actions(driver);
		Robot r = new Robot();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.NANOSECONDS);

		WebElement text = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		a.doubleClick(text).doubleClick(text).build().perform();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);

		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(10000);
		
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_J);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(4000);
		
		WebElement usrnme = driver.findElement(By.xpath("//input[@type='text']"));
		usrnme.sendKeys("vijayakumar");
		
		WebElement passwd = driver.findElement(By.xpath("//input[@type='password']"));
		passwd.sendKeys("passwordfgh");
		
		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		login.click();
		
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File ("C:\\Users\\vijay\\eclipse-workspace\\Mini_Projects\\Screenshots\\img.png");
		FileHandler.copy(from, to);
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		WebElement newact = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newact.click();
		
		Thread.sleep(7000);
		
		WebElement fstnme = driver.findElement(By.xpath("(//input [@type='text'])[2]"));
		fstnme.sendKeys("vijay");
		
		WebElement surname = driver.findElement(By.xpath("(//input [@type='text'])[3]"));
		surname.sendKeys("kumar");
		
		WebElement mblno = driver.findElement(By.xpath("(//input [@type='text'])[4]"));
		mblno.sendKeys("9003193413");
		
		WebElement nwpswd = driver.findElement(By.xpath("(//input [@type='password'])[2]"));
		nwpswd.sendKeys("Passwords");
		
		Thread.sleep(4000);
		
		WebElement dob = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s = new Select(dob);
		s.selectByValue("25");
		
		WebElement mnth = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s1= new Select(mnth);
		s1.selectByVisibleText("Apr");
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select s2 = new Select(year);
		s2.selectByValue("1994");
		
		WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		male.click();
		
		WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signup.click();
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File source = ts1.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\vijay\\eclipse-workspace\\Mini_Projects\\Screenshots\\img1.png");
		FileHandler.copy(source, destination);
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
