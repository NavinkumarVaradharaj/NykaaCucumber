package com.NykaaCucumber_IPT.runner;

import org.testng.annotations.Test;

import com.NykaaCucumber_IPT.base.BaseClass;
import com.NykaaCucumber_IPT.pom.PageObjectManager;

public class TestRunner extends BaseClass {

	@Test
	public void browser() {
		getDriver("chrome");
		launchUrl("https://www.nykaa.com/");
	}
	
	@Test
	public void login() {
		clickOnElement(PageObjectManager.getPom().getLogin_page().getSignin_btn());
		clickOnElement(PageObjectManager.getPom().getLogin_page().getSignin_mobile_option());
	}
}
