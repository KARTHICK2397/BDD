package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Reusables.Action;

public class SigninPage extends BasePage {
	public SigninPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//input[@id=\"ap_email\"]")
	WebElement sign_in_mobile;

	@FindBy(xpath = "//input[@id=\"continue\"]")
	WebElement continue_btn;

	@FindBy(xpath = "//span[@id=\"auth-login-via-otp-btn\"]")
	WebElement otp_btn;
	
	@FindBy(xpath = "//input[@aria-label=\"Verify OTP Button\"]")
	WebElement auth_otp_btn;
	
	

	// Action Methods

	public void signInTextBox(String input) {

		Action.sendInput(sign_in_mobile, input);

	}

	public void clickContinueBtn() {

		Action.click(continue_btn);

	}

	public void otpBtn() {
		Action.click(otp_btn);
	}
	
	public void authOtpBtn() {
		Action.click(auth_otp_btn);
	}

}
