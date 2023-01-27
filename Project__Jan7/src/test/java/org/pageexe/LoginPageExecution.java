package org.pageexe;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.baseutils.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.pagerepository.LoginPageRepo;

public class LoginPageExecution extends BaseClass {

	@Before
	public void before() {
		driver.get("https://www.facebook.com/");		
	}
	@Test
	public void test1() {
		LoginPageRepo obj=new LoginPageRepo();
		type(obj.getUsername(),"ramjan");
		type(obj.getPassword(),"begum");
		obj.button.click();
		
		
	}
	@Test
	public void test2() {
		LoginPageRepo obj=new LoginPageRepo();
		type(obj.getUsername(),"hafsha");
		type(obj.getPassword(),"uamira");
		obj.button.click();
	}
	@Test 
	public void test3() {
		LoginPageRepo obj=new LoginPageRepo();
		type(obj.getUsername(),"Ayesha");
		type(obj.getPassword(),"umaira");
		obj.button.click();
	}
	
	@After
	public  void screen() throws IOException {
		TakesScreenshot doc = (TakesScreenshot)driver;
		File source=doc.getScreenshotAs(OutputType.FILE) ;
		File des=new File("C:\\Users\\Hafs\\Desktop\\ScreenshotRes\\image.jpeg");
		FileHandler.copy(source,des);
		
	}
	
	
	
	
	 
}
