package org.baseutils;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public  static void browerlaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	public static void type(WebElement element,String data) {
		element.sendKeys(data);
	}
	
	@AfterClass
	public  static void after() {
		driver.close();
	}
	
	

}
