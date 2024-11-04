package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import factory.BaseClass;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductPage1;

public class TitleSteps {
	HomePage hp;
	ProductPage1 pp;
	CartPage cp;
	 String expected;
	 String actual="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

	@When("page title is captured by automation code")
	public void page_title_is_captured_by_automation_code() {
		hp = new HomePage(BaseClass.getDriver());
		expected=hp.titleCheck();
	}

	@Then("it should validate with existing title and both should match")
	public void it_should_validate_with_existing_title_and_both_should_match() {
	   Assert.assertEquals(expected, actual);
	}
}
