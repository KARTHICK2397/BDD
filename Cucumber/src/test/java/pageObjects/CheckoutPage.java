package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Reusables.Action;

public class CheckoutPage extends BasePage {
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//a[@id=\"addressChangeLinkId\"]")
	WebElement change_link;

	@FindBy(xpath = "//a[@id=\"add-new-address-popover-link\"]")
	WebElement new_address_link;

	@FindBy(xpath = "//input[@id=\"address-ui-widgets-enterAddressFullName\"]")
	WebElement full_name;

	@FindBy(xpath = "//input[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]")
	WebElement phone_number;

	@FindBy(xpath = "//input[@id=\"address-ui-widgets-enterAddressPostalCode\"]")
	WebElement pincode;

	@FindBy(xpath = "//input[@id=\"address-ui-widgets-enterAddressLine1\"]")
	WebElement address_number;

	@FindBy(xpath = "//input[@id=\"address-ui-widgets-enterAddressLine2\"]")
	WebElement street;

	@FindBy(xpath = "//input[@id=\"address-ui-widgets-landmark\"]")
	WebElement landmark;

	@FindBy(xpath = "//input[@id=\"address-ui-widgets-enterAddressCity\"]")
	WebElement city;

	@FindBy(xpath = "//span[text()=\"Choose a state\"]")
	WebElement state_click;

	@FindBy(xpath = "//div[@class=\"a-popover-inner a-lgtbox-vertical-scroll\"]//ul//li//a[text()=\"TAMIL NADU\"]")
	WebElement state_select;

	@FindBy(xpath = "//span[@id=\"address-ui-widgets-form-submit-button\"]")
	WebElement use_this_button;

	@FindBy(xpath = "//input[@aria-labelledby='submitOrderButtonId-announce']")
	WebElement place_the_order;

	// Action Methods
	public void changeLink() {
		Action.click(change_link);
	}

	public void newaddressLink() {
		Action.click(new_address_link);
	}

	public void setName(String inp) {
		Action.sendInput(full_name, inp);
	}

	public void setMobileNumber(String inp) {
		Action.sendInput(phone_number, inp);
	}

	public void setPincode(String inp) {
		Action.sendInput(pincode, inp);
	}

	public void setStreetNumber(String inp) {
		Action.sendInput(address_number, inp);
	}

	public void setArea(String inp) {
		Action.sendInput(street, inp);
	}

	public void setLandMark(String inp) {
		Action.sendInput(landmark, inp);
	}

	public void setCity(String inp) {
		Action.sendInput(city, inp);
	}

	public void stateClick() {
		Action.click(state_click);
	}

	public void stateSelect() {
		Action.click(state_select);
	}

	public void useThisButton() {
		Action.click(use_this_button);
	}

	public void placeTheOrder() throws InterruptedException {

		Action.click(place_the_order);
	}

}
