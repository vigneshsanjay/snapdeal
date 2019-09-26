package orderitems;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuynowPojoClass extends BaseClass{
	public BuynowPojoClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="pincode-check")
	private WebElement eb_pincode;
	
	@FindBy(id="pincode-check-bttn")
	private WebElement btn_checkpincode;
	
	@FindBy(id="buy-button-id")
	private WebElement btn_buynow;

	public WebElement getEb_pincode() {
		return eb_pincode;
	}

	public WebElement getBtn_checkpincode() {
		return btn_checkpincode;
	}

	public WebElement getBtn_buynow() {
		return btn_buynow;
	}
	

}
