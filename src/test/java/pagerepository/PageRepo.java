package pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseutils.BaseClass;

public class PageRepo extends BaseClass{
	public PageRepo() {
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//span[@class='link']")
	private WebElement signin;
	
	//@FindBy(xpath="//p[@class='google-button']")
	//private WebElement withgoogle; 
	
	@FindBy(xpath="//a[@href='/join']")    //a[@  href='/join' ]
	private WebElement join;
	
	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="confirmPassword")
	private WebElement cpass;
	
	@FindBy(id="hmeCty")
	private WebElement city;
	
	@FindBy(id="joinBtn")
	private WebElement joinbutton;
	
	
	
	/*public WebElement getWithgoogle() {
		withgoogle.click();
		return withgoogle;
	} */

	public WebElement getSignin() {
		signin.click();
		return signin;		
	}
	
	public WebElement getJoin() {
		//join.click();
		return join;
	}

	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCpass() {
		return cpass;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getJoinbutton() {
		//joinbutton.click();
		return joinbutton;
	}	
	//@FindBy(name="login")
	//public WebElement button;
	
	

}
