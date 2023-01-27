package org.pageexe;

import org.baseutils.BaseClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.pagerepo.LoginPageRepo;

public class HomePageExe extends BaseClass {

	@Before
	public void before() {
		driver.get("https://www.facebook.com/");
	}

	@Ignore
	@Test
	public void test3() {
		LoginPageRepo repo = new LoginPageRepo();
		type(repo.getUsername(), "syed");
		type(repo.getPassword(), "nedeem");
	}

	@Ignore
	@Test
	public void test4() {
		LoginPageRepo repo = new LoginPageRepo();
		type(repo.getUsername(), "manick");
		type(repo.getPassword(), "raju");
	}
	
	@Test
	public void test5() {
		// it will come from webelement
		String actual = "xx";
		String expected = "xx";
		
		
		Assert.assertTrue(actual.equals(expected));
	}
}
