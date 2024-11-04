package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.ProductPage1;

public class SearchSteps {
	HomePage hp;
	ProductPage1 pp;
	
	@Given("users open the amazon home page")
	public void users_open_the_amazon_home_page() {
	    
	}
	
	
	@When("user enters the search product {string}")
	public void user_enters_the_search_product(String productname) {
		 hp = new HomePage(BaseClass.getDriver());
		   hp.searchBox(productname);
	}



	@When("the user clicks on search button")
	public void the_user_clicks_on_search_button() {
		hp = new HomePage(BaseClass.getDriver());
		hp.searchBoxClick();
	}
	

	@Then("the user should be able to see the product list")
	public void the_user_should_be_able_to_see_the_product_list() {
	   
	       pp= new ProductPage1(BaseClass.getDriver());
	       
	       Assert.assertEquals(pp.targetProducts(), true);
		
	}


}
