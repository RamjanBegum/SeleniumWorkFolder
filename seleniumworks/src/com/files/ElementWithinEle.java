package com.files;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ElementWithinEle {
	public static void main(String[] args) throws InterruptedException {		
		ChromeOptions opt= new  ChromeOptions();
		opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		
		System.setProperty("webdriver.chrome.driver", "E://JAVA_ramz//driverssoftware//chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver(opt); //' []
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();	
		driver.get("https://google.com");
		driver.navigate().to("https://trytestingthis.netlify.app/");
		driver.navigate().refresh();

		driver.quit();
		
		
	/*List <WebElement> chioce=driver.findElements(By.tagName("select"));
		for (WebElement result : chioce) {
			System.out.println(result.getText());			
		} 	*/	
		
		
	}
}
