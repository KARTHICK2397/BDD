package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Reusables.Action;
	public class ProductBookPage extends BasePage {
		
		public  ProductBookPage(WebDriver driver) {
			super(driver);
		}

		
		@FindBy(xpath = "//label[@for=\"ap_email\"]")
		WebElement book;
		
		@FindBy(xpath = "//input[@id=\"buy-now-button\"]")
		WebElement buy_now;
		// Action Methods	

	    
	    public void switchTab(String arg) {
	    Action.multipleWindowHandling(driver,arg);
	    
	    }
	   
		    
		    
	    public void buyNow() {
	    	
	    	Action.click(buy_now);
	    }
	    
	    public boolean bookPage() {
	    	return Action.isDisplayeD( book);
	    }
}
