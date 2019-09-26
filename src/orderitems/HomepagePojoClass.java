package orderitems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePojoClass extends BaseClass {
	
	
		public HomepagePojoClass()
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="inputValEnter")
		private WebElement eb_searchbox;
		
		@FindBy(xpath="//span[@class='searchTextSpan']")
		private WebElement btn_searchbtn;

		public WebElement getEb_searchbox() {
			return eb_searchbox;
		}

		public WebElement getBtn_searchbtn() {
			return btn_searchbtn;
		}
					
		
		}
		
		
		
		
		
		