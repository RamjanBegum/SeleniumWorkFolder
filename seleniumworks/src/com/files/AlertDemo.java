package com.files;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://JAVA_ramz//driverssoftware//chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver(); //' []
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.close();

		WebElement simpleAlert =driver.findElement(By.xpath("//button[@onclick='jsAlert()'] "));
		simpleAlert.click();
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		System.out.println(alert1.getText());
		driver.close(); 
		//confirm  alert 
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(4000) ;
		Alert alert2=driver.switchTo().alert();

		alert2.accept();
		System.out.println(alert2.getText()); 

		//prompt alert
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(4000) ;
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("Ramjan Begum ");
		Thread.sleep(4000) ;
		alert3.accept();

		//System.out.println(alert3.getText()); 
		//driver.quit();
		driver.close();



	}

}
