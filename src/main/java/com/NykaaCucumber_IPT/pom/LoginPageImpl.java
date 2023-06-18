package com.NykaaCucumber_IPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaCucumber_IPT.base.BaseClass;

public class LoginPageImpl extends BaseClass implements LoginPage {
	
	public LoginPageImpl() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = signIn_button_xpath)
	private WebElement signin_btn;
	
	@FindBy(xpath = signIn_mobile_xpath)
	private WebElement signin_mobile_option;
	
	@FindBy(name = input_mobile_name)
	private WebElement mobile_input;
	
	@FindBy(id = proceed_button_id)
	private WebElement proceed_btn;
	
	@FindBy(id = input_otp_id)
	private WebElement otp_input;
	
	@FindBy(xpath = verify_button_xpath)
	private WebElement verify_btn;

	public WebElement getSignin_btn() {
		return signin_btn;
	}

	public WebElement getSignin_mobile_option() {
		return signin_mobile_option;
	}

	public WebElement getMobile_input() {
		return mobile_input;
	}

	public WebElement getProceed_btn() {
		return proceed_btn;
	}

	public WebElement getOtp_input() {
		return otp_input;
	}

	public WebElement getVerify_btn() {
		return verify_btn;
	}
	
	

}
