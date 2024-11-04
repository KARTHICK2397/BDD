package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Reusables.Action;

public class LoginPage extends BasePage {

	

public LoginPage(WebDriver driver) {
	super(driver);
}


//WEB ELEMENT
@FindBy(xpath = "//input[@id=\"email\"]")
WebElement email;

@FindBy(xpath = "//input[@name=\"login[password]\"]")
WebElement password;

@FindBy(linkText = "Sign In")
WebElement linkclick;

@FindBy(xpath = "//span[text()=\"Welcome, Karthick Smart!\"]")
WebElement check_elem;


@FindBy(xpath = "//div[text()=\"If you have an account, sign in with your email address.\"]//parent::fieldset//child::div[@class=\"field email required\"]//following-sibling::div[@class=\"actions-toolbar\"]//child::button//span")
WebElement sign_in_btn;

//ACTION METHODS
public void setEmail(String email_id) {
	
	Action.sendInput(email, email_id);
}

public void setPassword(String password_arg) {
	
	Action.sendInput(password, password_arg);
}

public void sign_in1() {
	
	Action.click(linkclick);
}
public void sign_in2() {
	
	Action.click(sign_in_btn);
}

}