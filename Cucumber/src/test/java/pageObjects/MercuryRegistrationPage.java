package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Reusables.Action;

public class MercuryRegistrationPage extends BasePage {

	public MercuryRegistrationPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//input[@name=\"firstName\"]")
	WebElement first_name;

	@FindBy(xpath = "//input[@name=\"lastName\"]")
	WebElement last_name;

	@FindBy(xpath = "//input[@name=\"phone\"]")
	WebElement phone;

	@FindBy(xpath = "//input[@name=\"userName\"]")
	WebElement email;

	@FindBy(xpath = "//input[@name=\"address1\"]")
	WebElement address;

	@FindBy(xpath = "//input[@name=\"city\"]")
	WebElement city;

	@FindBy(xpath = "//input[@name=\"state\"]")
	WebElement state;

	@FindBy(xpath = "//input[@name=\"postalCode\"]")
	WebElement postal_code;

	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement user_name;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//input[@name=\"confirmPassword\"]")
	WebElement confirm_password;

	@FindBy(xpath = "//input[@name=\"submit\"]")
	WebElement submit_btn;
	

	@FindBy(xpath = "//select[@name=\"country\"]")
	WebElement country;

	// Action Methods
	public void setFirstName(String input) {
		Action.sendInput(first_name, input);
	}

	public void setLastName(String input) {
		Action.sendInput(last_name, input);
	}

	public void setPhoneNumber(String input) {
		Action.sendInput(phone, input);
	}

	public void setCity(String input) {
		Action.sendInput(city, input);
	}

	public void setPostalCode(String input) {
		Action.sendInput(postal_code, input);
	}

	public void setEmail(String input) {
		Action.sendInput(email, input);
	}

	public void setAddress(String input) {
		Action.sendInput(address, input);
	}

	public void setState(String input) {
		Action.sendInput(state, input);
	}

	public void setUserName(String input) {
		Action.sendInput(user_name, input);
	}

	public void setPassword(String input) {
		Action.sendInput(password, input);
	}

	public void setConfirmPassword(String input) {
		Action.sendInput(confirm_password, input);
		
	}

	public void submitBtn() {
		Action.click(submit_btn);
	}
	
	public void setCountry(String input) {
		Action.selectByVisibleText(country, input);
	}
}
