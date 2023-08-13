package com.NykaaCucumber_IPT.stepDef;

import com.NykaaCucumber_IPT.base.BaseClass;
import com.NykaaCucumber_IPT.pom.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	@Given("User launch the application")
	public void user_launch_the_application() {
	    getDriver("chrome");
	    launchUrl("https://www.nykaa.com/");
	}

	@When("User click the signIn option")
	public void user_click_the_sign_in_option() {
		clickOnElement(PageObjectManager.getPom().getLogin_page().getSignin_btn());
		clickOnElement(PageObjectManager.getPom().getLogin_page().getSignin_mobile_option());
	}
	
	@When("User enter {string} as mobile number")
	public void user_enter_as_mobile_number(String string) throws InterruptedException {
		Thread.sleep(3000);
	    input(PageObjectManager.getPom().getLogin_page().getMobile_input(), string);
	}

	@When("User click the proceed button")
	public void user_click_the_proceed_button() {
	    clickOnElement(PageObjectManager.getPom().getLogin_page().getProceed_btn());
	}

	@When("User enter the otp and verify")
	public void user_enter_the_otp_and_verify() throws InterruptedException {
	    Thread.sleep(60000);
	    clickOnElement(PageObjectManager.getPom().getLogin_page().getVerify_btn());
	}

	@Then("User navigate to User Home Page")
	public void user_navigate_to_user_home_page() {
	    driver.getTitle();
	}

	@When("user able to view baby powder")
	public void user_able_to_view_baby_powder() throws InterruptedException {
		Thread.sleep(5000);
		mouseHover(PageObjectManager.getPom().getHome_page().getMomandbaby_tab());
		clickOnElement(PageObjectManager.getPom().getHome_page().getBabypowder());
	    
	}

	@Then("user able to view list of baby powder")
	public void user_able_to_view_list_of_baby_powder() {
		switchWindow(1);
	}

	@When("user able to select the himalaya powder")
	public void user_able_to_select_the_himalaya_powder() {
	    clickOnElement(PageObjectManager.getPom().getProduct_page().getHimalaya_babypowder());
	}

	@When("user able to change the size using dropdown")
	public void user_able_to_change_the_size_using_dropdown() {
		switchWindow(2);
		selectFromDropDown(PageObjectManager.getPom().getProduct_page().getSize_dropdown(), "text", "200g");
	}

	@When("user able to add the product into bag")
	public void user_able_to_add_the_product_into_bag() {
	    clickOnElement(PageObjectManager.getPom().getProduct_page().getAddToBag_btn());
	}

	@When("user able to open the bag")
	public void user_able_to_open_the_bag() {
	    clickOnElement(PageObjectManager.getPom().getBag_page().getOpen_bag());
	}

	@When("user able to change the required quantity")
	public void user_able_to_change_the_required_quantity() {
	    frameUsingElement(PageObjectManager.getPom().getBag_page().getBag_frame());
	    clickOnElement(PageObjectManager.getPom().getBag_page().getQuantity_icon());
	    explicitWait(PageObjectManager.getPom().getBag_page().getSelect_quantity_radio());
	    clickOnElement(PageObjectManager.getPom().getBag_page().getSelect_quantity_radio());
	}

	@When("user able to proceed with the required quantity")
	public void user_able_to_proceed_with_the_required_quantity() {
	    clickOnElement(PageObjectManager.getPom().getBag_page().getProceed_btn());
	    clickOnElement(PageObjectManager.getPom().getBag_page().getDeliver_here_btn());
	}

	@When("user able to enter credit card number")
	public void user_able_to_enter_credit_card_number() {
	    clickOnElement(PageObjectManager.getPom().getPayment_page().getCard_number_input());
	    input(PageObjectManager.getPom().getPayment_page().getCard_number_input(), "3566000020000410");
	}

	@When("user able to enter expiry date")
	public void user_able_to_enter_expiry_date() {
		clickOnElement(PageObjectManager.getPom().getPayment_page().getExpiry_input());
	    input(PageObjectManager.getPom().getPayment_page().getExpiry_input(), "02/26");
	}

	@When("user able to enter cvv number")
	public void user_able_to_enter_cvv_number() {
	    clickOnElement(PageObjectManager.getPom().getPayment_page().getCvv_input());
	    input(PageObjectManager.getPom().getPayment_page().getCvv_input(), "123");
	   
	}

	@When("user able to pay using credit card")
	public void user_able_to_pay_using_credit_card() {
	    clickOnElement(PageObjectManager.getPom().getPayment_page().getPay_btn());
	}

	@When("user take the screenshot if payment failed")
	public void user_take_the_screenshot_if_payment_failed() throws InterruptedException {
	    Thread.sleep(5000);
		screenshot();
	    clickOnElement(PageObjectManager.getPom().getPayment_page().getClose_btn());
	}
	
	@When("user able to click the bag")
	public void user_able_to_click_the_bag() {
	    clickOnElement(PageObjectManager.getPom().getPayment_page().getOpen_bag());
	    
	}

	@When("user edit the bag details")
	public void user_edit_the_bag_details() {
		clickOnElement(PageObjectManager.getPom().getPayment_page().getEdit_bag());
		
	}

	@When("user removes the product from the bag")
	public void user_removes_the_product_from_the_bag() {
		frameUsingElement(PageObjectManager.getPom().getBag_page().getBag_frame());
	    clickOnElement(PageObjectManager.getPom().getBag_page().getRemove_icon());
	    clickOnElement(PageObjectManager.getPom().getBag_page().getRemove_btn());
	    
	}

	@When("user click the logout button")
	public void user_click_the_logout_button() {
	    driver.getTitle();
	}


}
