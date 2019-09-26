package orderitems;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1PojoClass extends BaseClass {
	public LoginPage1PojoClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement eb_username;
	
	@FindBy(id="login-continue")
	private WebElement btn_continue;

	public WebElement getEb_username() {
		return eb_username;
	}

	public WebElement getBtn_continue() {
		return btn_continue;
	}
	
	

}
