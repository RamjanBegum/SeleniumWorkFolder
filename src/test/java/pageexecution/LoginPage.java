package pageexecution;

import java.awt.AWTException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


import baseutils.BaseClass;
import pagerepository.PageRepo;

public class LoginPage extends BaseClass {
	@Before
	public void before() {
		driver.get("https://www.cheapair.com/");		
	}
	@Ignore
	@Test
	public void test1() {		
		PageRepo obj=new PageRepo();
		obj.getSignin();		
	}
	@Ignore
	@Test
	public void test2() {
	//	PageRepo obj=new PageRepo();
		//obj.getWithgoogle();
	}
	
	@Ignore
	@Test
	public void test3() {		
		PageRepo obj=new PageRepo();
		obj.getJoin();		
	}
	
	@Test	
	public void test4() {
		PageRepo obj=new PageRepo();
		obj.getJoin().click();
		type(obj.getFirstName(),"ramjan");
		type(obj.getLastName(),"begum");
		type(obj.getEmail(),"ramzazarudeen@gmail.com");
		type(obj.getPassword(),"ramjan123");
		type(obj.getCpass(),"ramjan123");
		
		type(obj.getCity(),"Mad");
		
		try {
			obj.actionClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.getJoinbutton().click();
		
		
	}

}
