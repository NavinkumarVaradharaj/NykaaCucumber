package com.NykaaCucumber_IPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaCucumber_IPT.base.BaseClass;

public class BagPageImpl extends BaseClass implements BagPage {
	
	public BagPageImpl() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = open_bag_icon_xpath)
	private WebElement open_bag;
	
	@FindBy(xpath = frame_xpath)
	private WebElement bag_frame;
	
	@FindBy(xpath = quantity_xpath)
	private WebElement quantity_icon;
	
	@FindBy(xpath = select_quantity_xpath)
	private WebElement select_quantity_radio;
	
	@FindBy(xpath = proceed_btn_xpath)
	private WebElement proceed_btn;
	
	@FindBy(xpath = deliverHere_btn_xpath)
	private WebElement deliver_here_btn;
	
	@FindBy(xpath = remove_icon_xpath)
	private WebElement remove_icon;

	@FindBy(xpath = remove_btn_xpath)
	private WebElement remove_btn;

	public WebElement getOpen_bag() {
		return open_bag;
	}

	public WebElement getBag_frame() {
		return bag_frame;
	}

	public WebElement getQuantity_icon() {
		return quantity_icon;
	}

	public WebElement getSelect_quantity_radio() {
		return select_quantity_radio;
	}

	public WebElement getProceed_btn() {
		return proceed_btn;
	}

	public WebElement getDeliver_here_btn() {
		return deliver_here_btn;
	}

	public WebElement getRemove_icon() {
		return remove_icon;
	}

	public WebElement getRemove_btn() {
		return remove_btn;
	}
	
	
}
