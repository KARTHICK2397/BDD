package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Reusables.Action;

public class LanguagePage extends BasePage {
	public LanguagePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//span[text()=\"TA\"]//preceding::input[@type=\"radio\" and @value=\"ta_IN\"]//following-sibling::i")
	WebElement tamil_radio_btn;
	
	@FindBy(xpath = "//span[text()=\"மாற்றங்களைச் சேமி\"]//preceding-sibling::input")
	WebElement save_change_btn;
	
	//Action Methods
	 public void tamilRadioBtn() {
			
			Action.click(tamil_radio_btn);
			
	    }
	 public void saveChangeBtn() {
			
			Action.click(save_change_btn);
			
	    }
}
