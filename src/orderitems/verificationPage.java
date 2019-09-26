package orderitems;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verificationPage extends BaseClass{
	public verificationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="verification-code-val")
	private WebElement eb_otp;
	
	@FindBy(id="create-register-acc-submit")
	private WebElement btn_otp;

	public WebElement getEb_otp() {
		return eb_otp;
	}

	public WebElement getBtn_otp() {
		return btn_otp;
	}
	

}
