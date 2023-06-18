package com.NykaaCucumber_IPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaCucumber_IPT.base.BaseClass;

public class ProductPageImpl extends BaseClass implements ProductPage {
	public ProductPageImpl() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = himalaya_babypowder_xpath)
	private WebElement himalaya_babypowder;
	
	@FindBy(xpath = size_dropdown_xpath)
	private WebElement size_dropdown;
	
	@FindBy(xpath = addtobag_xpath)
	private WebElement addToBag_btn;

	public WebElement getHimalaya_babypowder() {
		return himalaya_babypowder;
	}

	public WebElement getSize_dropdown() {
		return size_dropdown;
	}

	public WebElement getAddToBag_btn() {
		return addToBag_btn;
	}
	
	
}
