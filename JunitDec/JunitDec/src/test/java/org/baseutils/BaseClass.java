package org.baseutils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;	

	public static WebDriver driver;
	
	@BeforeClass
	public static void browserlaunch()
	{
		// Extent reports 
		reporter = new ExtentHtmlReporter("./junitdecreport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
			
		// Browser launch
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void after()
	{
		extent.flush();
	}
	
	public static void type(WebElement element, String data)
	{
		element.sendKeys(data);
	}
	
	@AfterClass
	public static void close()
	{
		driver.close();
	}
}
