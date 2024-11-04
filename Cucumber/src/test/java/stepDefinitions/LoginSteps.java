package stepDefinitions;

import java.util.Map;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPage;
public class LoginSteps {
	
	LoginPage logpage= new LoginPage(BaseClass.getDriver());
	@Given("users open login page")
	public void users_open_login_page() {
		logpage= new LoginPage(BaseClass.getDriver());
		logpage.sign_in1();
		
	}

	 //*******   Data Driven test **************
	@When("user enters the login crdentials")
	public void user_enters_the_login_crdentials(io.cucumber.datatable.DataTable dataTable) {
   
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
	    
		logpage= new LoginPage(BaseClass.getDriver());
		logpage.setEmail(dataMap.get("email"));
		logpage.setPassword(dataMap.get("password"));
		
	}
		

	@When("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
		logpage= new LoginPage(BaseClass.getDriver());
		logpage.sign_in2();
		
	}
	
	@When("user enters the login crdentials {string} and {string}")
	public void user_enters_the_login_crdentials_and(String string1, String string2) throws InterruptedException {
		logpage= new LoginPage(BaseClass.getDriver());
		logpage.setEmail(string1);
		logpage.setPassword(string2);
		logpage.sign_in2();
		
		Thread.sleep(3000);
	}
	
	@Then("the user should be able to see the home page")
	public void the_user_should_be_able_to_see_the_home_page() throws InterruptedException {
	  
		logpage= new LoginPage(BaseClass.getDriver());
	
	
	}



}
