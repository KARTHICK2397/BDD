package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductPage1;

public class Dropdown {

	HomePage hp;
	ProductPage1 pp;
	CartPage cp;
	

	@When("user select the drop down from search box")
	public void user_select_the_drop_down_from_serach_box() throws InterruptedException {
	    
		hp=new HomePage(BaseClass.getDriver());
		hp.selectDropDownByVisibletext("Jewellery");
		hp.searchBoxClick();
		Thread.sleep(5000);
		
	}

	@Then("the user should be able to see the list of product")
	public void the_user_should_be_able_to_see_the_list_of_product() {
	  
		pp= new ProductPage1(BaseClass.getDriver());
		
		
		Assert.assertEquals(pp.jewel_products(), true);
	}



}
