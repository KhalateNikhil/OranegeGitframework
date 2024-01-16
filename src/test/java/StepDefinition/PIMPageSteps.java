package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageSteps extends BaseClass {
	private static PIMPage pimpage;
	private static String EmpId;

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

	@Then("user click on Add employee")
	public void user_click_on_add_employee() {
		pimpage.clickOnAddEmployee();

	}

	@Then("user enter fname and lastname and click on save button")
	public void user_enter_fname_and_lastname_and_click_on_save_button() throws InterruptedException {

		pimpage.addNewEmployee("nikhil", "khalate");
	}

	@Then("user capture the employee id number")
	public void user_capture_the_employee_id_number() throws InterruptedException {
		EmpId = pimpage.captureEmpId();

	}

	@Then("user click on employee list button")
	public void user_click_on_employee_list_button() throws InterruptedException {
		pimpage.clickOnEmpList();

	}

}
