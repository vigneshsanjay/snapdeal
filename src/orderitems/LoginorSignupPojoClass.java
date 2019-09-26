package orderitems;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginorSignupPojoClass extends BaseClass{
	public LoginorSignupPojoClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login-continue")
	private WebElement btn_login;
	
	@FindBy(xpath="//*[@id=\"username\"]")
	private WebElement eb_email;
	
	
	@FindBy(id="username")
	private WebElement eb_username;
	

	@FindBy(id="mobile-number")
	private WebElement eb_mobnum;
	
	@FindBy(id="j_name")
	private WebElement eb_name;
	

	@FindBy(id="j_dob")
	private WebElement eb_dob;
	

	@FindBy(id="w_password")
	private WebElement eb_pass;
	
	@FindBy(xpath="//*[@id=\"register-done\"]")
	private WebElement btn_register;
	
	public WebElement getBtn_login() {
		return btn_login;
	}

	
	public WebElement getEb_email() {
		return eb_email;
	}


	public WebElement getEb_username() {
		return eb_username;
	}

	public WebElement getEb_mobnum() {
		return eb_mobnum;
	}

	public WebElement getEb_name() {
		return eb_name;
	}

	public WebElement getEb_dob() {
		return eb_dob;
	}

	public WebElement getEb_pass() {
		return eb_pass;
	}

	public WebElement getBtn_register() {
		return btn_register;
	}
}
