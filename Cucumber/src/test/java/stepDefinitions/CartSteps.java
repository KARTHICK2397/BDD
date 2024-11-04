package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductPage1;

public class CartSteps {
	
	HomePage hp;
	ProductPage1 pp;
	CartPage cp;

	@When("the user clicks on add to cart button")
	public void the_user_clicks_on_add_to_cart_button() throws InterruptedException {
	    pp = new ProductPage1(BaseClass.getDriver());
	    pp.scroll();
	    Thread.sleep(3000);
	    pp.clickCartBtn();
	    Thread.sleep(5000);
	    hp = new HomePage(BaseClass.getDriver());
	    hp.cartClick();
	}

	@Then("the user should be able to see the product in cart")
	public void the_user_should_be_able_to_see_the_product_in_cart() {
	    cp=new CartPage(BaseClass.getDriver());
	       Assert.assertEquals(true, cp.productCheck());
	}

}
