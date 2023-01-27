package com.files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebEleDemo {
	public static void main(String[] args) throws InterruptedException {		
		ChromeOptions opt= new  ChromeOptions();
		opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		
		System.setProperty("webdriver.chrome.driver", "E://JAVA_ramz//driverssoftware//chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver(opt); //' []
		driver.get("https://google.com");
		driver.manage().window().maximize();		 
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium"+ Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		//driver.quit();
	}
}
