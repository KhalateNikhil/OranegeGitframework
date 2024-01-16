package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PIMPage extends BaseClass{
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	
	
	public PIMPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnPim() throws InterruptedException
	{
		Thread.sleep(3000);
		Wait.click(pim);
		
	}
	
	public String getPimPageUrl() throws InterruptedException
	{
		Thread.sleep(3000);
		return driver.getCurrentUrl();
	}
	
}
