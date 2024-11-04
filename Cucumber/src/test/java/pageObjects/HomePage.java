package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Reusables.Action;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//input[@placeholder=\"Search Amazon.in\"]")
	WebElement searchBox;

	@FindBy(xpath = "//input[@id=\"nav-search-submit-button\"]")
	WebElement search_box_click;
	
	
	@FindBy(xpath = "//div[@id=\"nav-cart-count-container\"]")
	WebElement cart_btn;
		
	@FindBy(xpath = "//select[@aria-describedby=\"searchDropdownDescription\"]")
	WebElement drop_down;
	
	@FindBy(xpath = "//span[@class=\"icp-nav-flag icp-nav-flag-in icp-nav-flag-lop\"]")
	WebElement lang_btn;

	
	@FindBy(xpath = "//a[@aria-label=\"அனைத்து வகைப்பிரிவுகளின் மெனுவையும் திறக்கவும்\"]")
	WebElement tamil_text;
	
	// Action Methods	
	
	 public boolean tamilTextCheck() {
			
			return Action.isDisplayeD(tamil_text);
			
			
	    }
	
    public void searchBox(String input) {
		
		Action.sendInput(searchBox, input);
		
		
    }
    
    public void searchBoxClick() {
		
		Action.click(search_box_click);
		
	}
    
    public void cartClick() {
    	
    	Action.click(cart_btn);
		
	}
    
    
    public String titleCheck() {
    	
	return driver.getTitle();
		
	}
    
    public void selectDropDownByVisibletext(String inp) {
    	Action.selectByVisibleText(drop_down,inp);
    }
    
      public void langBtnClick() {
    	
    	Action.click(lang_btn);
		
	}
}
