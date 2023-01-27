package com.files;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementsDemo {
	public static void main(String[] args) throws InterruptedException {		
		ChromeOptions opt= new  ChromeOptions();
		opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		
		System.setProperty("webdriver.chrome.driver", "E://JAVA_ramz//driverssoftware//chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver(opt); //' []
		driver.get("https://google.com");
		driver.manage().window().maximize();	
		WebElement searchForm=driver.findElement(By.tagName("form"));
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium testing app"+Keys.ENTER);
		
		//driver.quit();
	}
}
