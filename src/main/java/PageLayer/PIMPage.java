package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PIMPage extends BaseClass{
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addemp;
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement save;
	
	
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
	
	
	
	public void clickOnAddEmployee()
	{
		Wait.click(addemp);	
		
	}
	
	public void addNewEmployee(String firstname,String lastname) throws InterruptedException
	
	{
		Thread.sleep(4000);
		Wait.sendKeys(fname, firstname);
		Wait.sendKeys(lname, lastname);
		Wait.click(save);
	}
	
	
	
	
	
	
	
}
