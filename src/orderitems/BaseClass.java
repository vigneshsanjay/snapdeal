package orderitems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	static WebDriver driver;
	static Select sel;
	public static WebDriver browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "./src/browserdriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
			
	}
	
	public static void passurl(String url)
	{
		driver.get(url);
	}
	
	public static void btnclick(WebElement b)
	{
		b.click();
	}
	
	public static void gettitle()
	{
		driver.getTitle();
	}
	
	public static void fill(WebElement e, String s)
	{
	e.sendKeys(s);
	}
	
	public static void sbi(WebElement e, int indexvalue)
	{
			sel=new Select(e);
			sel.selectByIndex(indexvalue);
	}
	
	public static void sbv(WebElement e, String value)
	{
			sel=new Select(e);
			sel.selectByValue(value);
	}
	
	public static void sbvt(WebElement e, String vtvalue)
	{
			sel=new Select(e);
			sel.selectByVisibleText(vtvalue); 
					
	}
	
	public static void browerClose()
	{
		driver.quit();
					
	}
	
	public static void explicit(String locator)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(locator)));
	}
			
		
		
		
		
	}


