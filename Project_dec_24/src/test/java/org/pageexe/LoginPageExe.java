package org.pageexe;

import org.baseutils.BaseClass;
import org.openqa.selenium.WebElement;
import org.pagerepo.LoginPageRepo;

public class LoginPageExe extends BaseClass {

	@Before
	public void before() {
		driver.get("https://facebook.com/");
	}
	@Test
	public void test1() {
		LoginPageRepo repo=new LoginPageRepo();
		 type(repo.getUsername(),"ramjan");
		 type(repo.getpassword(),"begum");		
	}
	
	@Test
	public void test2() {
		LoginPageRepo repo=new LoginPageRepo();
		 type(repo.getUsername(),"Hafsha");
		 type(repo.getpassword(),"umaira");		
	}
	

}
