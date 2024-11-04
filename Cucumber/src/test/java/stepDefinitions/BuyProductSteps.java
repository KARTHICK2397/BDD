package stepDefinitions;

import java.util.Map;
import factory.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.ProductBookPage;
import pageObjects.SigninPage;

public class BuyProductSteps {
	CartPage cp;
	ProductBookPage PBP;
	SigninPage SP;
	CheckoutPage chp;

	@When("the user clicks on product")
	public void the_user_clicks_on_product() throws InterruptedException {
		cp = new CartPage(BaseClass.getDriver());
		// cp.quantityBtnClick();
		// cp.quantityCOuntSelect();
		cp.clickProduct();
	}

	@When("in the new tab will open user need to click buy now")
	public void in_the_new_tab_will_open_user_need_to_click_buy_now() throws InterruptedException {

		Thread.sleep(5000);

		PBP = new ProductBookPage(BaseClass.getDriver());
		PBP.switchTab("child");
	}

	@And("the user should be able to see the booking page")
	public void the_user_should_be_able_to_see_the_booking_page() throws InterruptedException {

		PBP = new ProductBookPage(BaseClass.getDriver());
		PBP.buyNow();

		// Assert.assertEquals(PBP.bookPage(),true);
		// PBP.switchTab("parent");

	}

	@When("enter the mobile number {string} and click continue button")
	public void enter_the_mobile_number_and_click_continue_button(String mobile_number) throws InterruptedException {
		SP = new SigninPage(BaseClass.getDriver());
		SP.signInTextBox(mobile_number);
		SP.clickContinueBtn();
		SP.otpBtn();
		Thread.sleep(20000);
		SP.authOtpBtn();

	}

	@When("user enters the following addersss and book the product")
	public void user_enters_the_following_addersss_and_book_the_product(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {

		CheckoutPage chp = new CheckoutPage(BaseClass.getDriver());
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		chp.changeLink();
		chp.newaddressLink();
		chp.setName(dataMap.get("name"));
		Thread.sleep(3000);
		chp.setMobileNumber(dataMap.get("mobile"));
		chp.setPincode(dataMap.get("pincode"));
		chp.setStreetNumber(dataMap.get("street number"));
		chp.setArea(dataMap.get("area"));
		chp.setLandMark(dataMap.get("landmark"));
		chp.setCity(dataMap.get("city"));
		// chp.stateClick();
		// chp.stateSelect();
		chp.useThisButton();
		Thread.sleep(7000);
		chp.placeTheOrder();
		Thread.sleep(3000);

	}

}
