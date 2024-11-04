package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Reusables.Action;

public class CartPage extends BasePage {
	
	public CartPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//span[text()=\"Oppo Reno 12 Pro 5G (Sunset Gold, 256 GB) (12 GB RAM)\"and@class=\"a-truncate-full a-offscreen\"]")
	WebElement product;
	
		
	@FindBy(xpath = "//a[@class=\"a-link-normal sc-product-link\"]/img")
	WebElement buyproduct;
	
	@FindBy(xpath = "//div[@class=\"a-popover a-dropdown a-dropdown-common a-declarative\"]//ul//li[@aria-labelledby=\"quantity_3\"]")
	WebElement quantity_count_select;
	
	@FindBy(xpath = "//span[@class=\"a-button-text a-declarative\"]")
	WebElement quantity_Btn_click;
	
		// Action Methods	
	    public boolean productCheck() {
			
			return Action.isDisplayeD(buyproduct);
			
	    }
	    
	    
	    public void quantityCOuntSelect() {
			
	 	   Action.selectByDiv(quantity_count_select);
	 			
	 	    }
	    
       public void quantityBtnClick() {
			
	   Action.click(quantity_Btn_click);
			
	    }
	    
	    public void clickProduct() {
	    	   
	    	Action.click(buyproduct);
	    }
}
