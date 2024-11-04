package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Reusables.Action;

public class ProductPage1 extends BasePage {
	
	public  ProductPage1(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//img[@alt=\"Wild Stone Edge Premium Perfume for Men, 50ml|Long Lasting Eau De Parfum|Luxury Fragrances\"]")
	WebElement target_products;

	@FindBy(xpath ="//img[@alt=\"Wild Stone Edge Premium Perfume for Men, 50ml|Long Lasting Eau De Parfum|Luxury Fragrances\"]//following::button[1]")
	WebElement product_cart_btn;
	
	@FindBy(xpath = "//span[text()=\"Customers’ Most-loved  Jewellery | 4+ star rated | 240+ ratings\"]")
	WebElement jewel_products;
	
		
	// Action Methods	
	
    public boolean targetProducts() {
		boolean b= target_products.isDisplayed();
		return b;
			
    }
    
    public void clickCartBtn() {
   
    	Action.click(product_cart_btn);
    }
    
    public void scroll() {
    	Action.scrollTillElement(driver, target_products);
    }
    
    public boolean jewel_products() {
    	boolean res=Action.isDisplayeD(jewel_products);
    	return res;
    }
   
  
}

