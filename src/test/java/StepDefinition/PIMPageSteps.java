package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageSteps extends BaseClass {
	private static PIMPage pimpage;

	@When("user click on pim link")
	public void user_click_on_pim_link() throws InterruptedException {
		pimpage = new PIMPage();
		pimpage.clickOnPim();
	}

	@Then("validate user is on pim page by using url")
	public void validate_user_is_on_pim_page_by_using_url() throws InterruptedException {
		String actUrl = pimpage.getPimPageUrl();
		boolean b = actUrl.contains("pim");
		Assert.assertTrue(b);

	}

}
