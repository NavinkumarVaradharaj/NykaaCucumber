package com.NykaaCucumber_IPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaCucumber_IPT.base.BaseClass;

public class PaymentPageImpl extends BaseClass implements Payment {
	
	public PaymentPageImpl() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = card_number_input_xpath)
	private WebElement card_number_input;
	
	@FindBy(xpath = expiry_input_xpath)
	private WebElement expiry_input;
	
	@FindBy(xpath = cvv_input_xpath)
	private WebElement cvv_input;
	
	@FindBy(xpath = pay_btn_xpath)
	private WebElement pay_btn;
	
	@FindBy(xpath = close_btn_xpath)
	private WebElement close_btn;
	
	@FindBy(xpath = open_bag_xpath)
	private WebElement open_bag;
	
	@FindBy(xpath = edit_bag_xpath)
	private WebElement edit_bag;

	public WebElement getCard_number_input() {
		return card_number_input;
	}

	public WebElement getExpiry_input() {
		return expiry_input;
	}

	public WebElement getCvv_input() {
		return cvv_input;
	}

	public WebElement getPay_btn() {
		return pay_btn;
	}

	public WebElement getClose_btn() {
		return close_btn;
	}

	public WebElement getOpen_bag() {
		return open_bag;
	}

	public WebElement getEdit_bag() {
		return edit_bag;
	}
	
	
	

}
