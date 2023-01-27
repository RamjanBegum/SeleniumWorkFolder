package org.pageexe;

import org.baseutils.BaseClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.pagerepo.LoginPageRepo;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginPageExe extends BaseClass {

	@Before
	public void before() {
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void test1() {
		LoginPageRepo repo = new LoginPageRepo();
		type(repo.getUsername(), "pradeep");
		type(repo.getPassword(), "guru");
		
		// Extent reports
		ExtentTest logger = extent.createTest("Login Page Test");
		logger.log(Status.PASS, "Test successful");
	}

	@Ignore
	@Test
	public void test2() {
		LoginPageRepo repo = new LoginPageRepo();
		type(repo.getUsername(), "Ramzan");
		type(repo.getPassword(), "Priyanka");
	}
}
