package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	
	@FindBy(xpath="//div[@class='oxd-brand-banner']")
	private WebElement logo;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getHomePageTitle()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return driver.getTitle();
	}
  
	
	public String getHomePageUrl()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return driver.getCurrentUrl();
	}
	
	public boolean getHomePageLogo()
	{
		return logo.isDisplayed();
	}
	
	
	
	
	
	
	
}
