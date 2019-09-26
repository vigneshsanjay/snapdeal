package orderitems;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemsPagePojoClass extends BaseClass{
	
	public ItemsPagePojoClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"642241335330\"]/div[2]/a/picture/img")
	private WebElement lk_iphone;

	public WebElement getLk_iphone() {
		return lk_iphone;
	}
	

}
