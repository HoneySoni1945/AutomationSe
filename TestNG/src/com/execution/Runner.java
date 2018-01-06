package com.execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner {
	
WebDriver driver;
Properties P;
@AfterMethod
public void Kill()
{
driver.quit();	
}

@BeforeMethod
public void register() throws FileNotFoundException, IOException
{
	
	Properties p = new Properties();
	p.load(new FileInputStream("config.properties"));
	WebDriver driver;
	//System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	switch(p.getProperty("browser"))
	{
	case "gc":
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	driver = new ChromeDriver();
	break;
	case "ff":
		System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
    driver = new FirefoxDriver();
		break;
	case "ie":
		System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
    driver = new FirefoxDriver();
		break;
		default:
			System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
	}
	Reporter.log("Initiallization Succesful");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(p.getProperty("url"));
	WebElement my_acc = driver.findElement(By.partialLinkText("MY ACCOUNT"));
	//WebElement my_acc = driver.findElement(By.partialLinkText("MY ACCOUNT"));
	my_acc.click();
}
	@Test(priority=1,groups={"smoke","sanity","regression"})
		public void regester(){
		WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
		register.click();
		}

		@Test(priority=2,dependsOnMethods={"regester"},groups="regression")
	
		public void login() throws FileNotFoundException, IOException{
		
		////
		
	}
	
		}


