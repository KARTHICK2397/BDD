package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LanguagePage;
import org.junit.Assert;

public class ChangeToLanguageTamilSteps {
	
	HomePage hp;
	LanguagePage lp;
	@When("user clicks on language button")
	public void user_clicks_on_language_button() {
	   
		hp=new HomePage(BaseClass.getDriver());
		hp.langBtnClick();
		
	}

	@When("clicks on tamil language button and click save changes button")
	public void clicks_on_tamil_language_button_and_click_save_changes_button() {
		lp= new LanguagePage(BaseClass.getDriver());
	    lp.tamilRadioBtn();
		lp.saveChangeBtn();
	}

	@Then("the user should be able to see the amazon in tamil langauge")
	public void the_user_should_be_able_to_see_the_amazon_in_tamil_langauge() {
	   
		hp= new HomePage(BaseClass.getDriver());
		Assert.assertEquals(hp.tamilTextCheck(),true);
		
	}



}
