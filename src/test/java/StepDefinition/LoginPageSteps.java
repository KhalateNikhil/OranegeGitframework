package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;

public class LoginPageSteps extends BaseClass{

	private static LoginPage lg;

@Given("user is on login page")
public void user_is_on_login_page() 
{
	BaseClass.initialization();
	String url1=prop.getProperty("url");
	driver.get(url1);
   
}

@Given("user enter username password and click on login button")
public void user_enter_username_password_and_click_on_login_button() 
{
  lg= new LoginPage();
  lg.loginFunctionality("Admin", "admin123");
}



}
