package com.NykaaCucumber_IPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaCucumber_IPT.base.BaseClass;

public class HomePageImpl extends BaseClass implements HomePage {

	public HomePageImpl() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = mombaby_tab_xpath)
	private WebElement momandbaby_tab;
	
	@FindBy(xpath = babypowder_xpath)
	private WebElement babypowder;

	public WebElement getMomandbaby_tab() {
		return momandbaby_tab;
	}

	public WebElement getBabypowder() {
		return babypowder;
	}
	
	
}
