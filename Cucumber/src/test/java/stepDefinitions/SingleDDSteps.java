package stepDefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import factory.BaseClass;
import io.cucumber.java.en.When;
import pageObjects.MercuryRegistrationPage;
import utilities.DataReader;

public class SingleDDSteps {

	MercuryRegistrationPage rp = new MercuryRegistrationPage(BaseClass.getDriver());

	List<HashMap<String, String>> datamap; // Data driven

	@When("user fills the required details for registration form")
	public void user_fills_the_required_details_for_registration_form() throws InterruptedException {

		try {
			datamap = DataReader.data("C:\\Users\\Kishore\\Music\\Cucumber\\test data\\DD_EXCEL.xlsx", "userdetails");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int index = 0;
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

}
