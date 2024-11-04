package stepDefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MercuryRegistrationPage;
import utilities.DataReader;

public class DDSteps {

	MercuryRegistrationPage rp = new MercuryRegistrationPage(BaseClass.getDriver());

	List<HashMap<String, String>> datamap; // Data driven

	@Given("users opens the mercury registration page")
	public void users_opens_the_mercury_registration_page() {
		BaseClass.getLogger().info("open the registrationpage--- ");
	}

	@When("user fills the required details for registration with excel rows {string}")
	public void user_fills_the_required_details_for_registration_with_excel_rows(String rows)
			throws InterruptedException {
		try {
			datamap = DataReader.data("C:\\Users\\Kishore\\Music\\Cucumber\\test data\\DD_EXCEL.xlsx", "userdetails");
		} catch (IOException e) {
			e.printStackTrace();
		}

		int index = Integer.parseInt(rows) - 1;
		rp.setFirstName(datamap.get(index).get("firstname"));
		rp.setLastName(datamap.get(index).get("lastname"));
		rp.setPhoneNumber(datamap.get(index).get("phone"));
		rp.setPostalCode(datamap.get(index).get("postalcode"));
		rp.setEmail(datamap.get(index).get("email"));
		rp.setCity(datamap.get(index).get("city"));
		rp.setAddress(datamap.get(index).get("address"));
		rp.setState(datamap.get(index).get("state"));
		rp.setUserName(datamap.get(index).get("username"));
		rp.setPassword(datamap.get(index).get("password"));
		rp.setConfirmPassword(datamap.get(index).get("confirmpassword"));
		rp.setCountry(datamap.get(index).get("country"));
		Thread.sleep(5000);
		BaseClass.getLogger().info("filled the details--- ");
	}

	@When("the user clicks on submit button")
	public void the_user_clicks_on_submit_button() throws InterruptedException {
		rp.submitBtn();
		BaseClass.getLogger().info("clicked the submit button--- ");
		Thread.sleep(5000);
	}

	@Then("the user should be able to see success message")
	public void the_user_should_be_able_to_see_success_message() {

	}

}
