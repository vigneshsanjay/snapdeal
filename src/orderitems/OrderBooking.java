package orderitems;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderBooking extends BaseClass{
	
	@BeforeMethod()
	public void setup()
	{
		browserLaunch();
		passurl("http://www.snapdeal.com");
	}
	
	@Test()
	public void booking() throws AWTException, InterruptedException
	{
		HomepagePojoClass hp=new HomepagePojoClass();
		fill(hp.getEb_searchbox(), "iphonexs in mobiles");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String window1 = driver.getWindowHandle();
		ItemsPagePojoClass ip = new ItemsPagePojoClass();
		btnclick(ip.getLk_iphone());
		
		Set<String> windows = driver.getWindowHandles();
		windows.size();
		Iterator<String> I1 = windows.iterator();
		while(I1.hasNext())
		{
			String child=I1.next();
			
			if(windows.equals(child))
			{
				driver.switchTo().window(child);
			}
			else
			{
				driver.switchTo().window(I1.next());
			}
		}
					
		
		BuynowPojoClass bp=new BuynowPojoClass();
		fill(bp.getEb_pincode(), "600118");
		btnclick(bp.getBtn_checkpincode());
		explicit("buy-button-id");
		btnclick(bp.getBtn_buynow());
		
		LoginPage1PojoClass li=new LoginPage1PojoClass();
		li.getEb_username().clear();
		fill(li.getEb_username(), "vignesh29596@gmail.com");
		Thread.sleep(5000);
		btnclick(li.getBtn_continue());
		
		LoginorSignupPojoClass ls=new LoginorSignupPojoClass();
		ls.getEb_email().clear();
		fill(ls.getEb_email(), "vignesh29596@gmail.com");
		Thread.sleep(3000);
		ls.getEb_mobnum().clear();
		fill(ls.getEb_mobnum(), "6369361288");
		ls.getEb_name().clear();
		fill(ls.getEb_name(),"vignesh");
		ls.getEb_dob().clear();
		fill(ls.getEb_dob(), "29/05/1996");
		ls.getEb_pass().clear();
		fill(ls.getEb_pass(), "Vignesh12345");
		btnclick(ls.getBtn_register());
		
		verificationPage vp=new verificationPage();
		fill(vp.getEb_otp(), "8817");
		btnclick(vp.getBtn_otp());
		
		
		
		
		
	}
	
	

}
