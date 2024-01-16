package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseClass
{
	private static HomePage homepage;

@When("user is on homepage and validate home page title")
public void user_is_on_homepage_and_validate_home_page_title()
{
	 homepage=new HomePage(); 
	String actTitle= homepage.getHomePageTitle();
	Assert.assertEquals(actTitle, "OrangeHRM");
}
@When("validate home page url")
public void validate_home_page_url() 
{
	String acturl=homepage.getHomePageUrl();
	boolean a=acturl.contains("dashboard");
	Assert.assertTrue(a);
   
}


@When("user validate home page logo")
public void user_validate_home_page_logo() 
{
	boolean a=homepage.getHomePageLogo();
	System.out.println("true");
	
	
   }






}
