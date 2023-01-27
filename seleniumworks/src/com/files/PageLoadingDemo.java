package com.files;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadingDemo {
	public static void main(String[] args) throws InterruptedException {		
		ChromeOptions opt= new  ChromeOptions();
		//opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		//opt.setPageLoadStrategy(PageLoadStrategy.EAGER);
		opt.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		System.setProperty("webdriver.chrome.driver", "E://JAVA_ramz//driverssoftware//chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver(opt); //' []
		driver.get("https://amazon.in");
		driver.manage().window().maximize();		 
		driver.quit();
	}
}
