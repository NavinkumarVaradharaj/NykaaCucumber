package com.NykaaCucumber_IPT.stepDef;

import com.NykaaCucumber_IPT.base.BaseClass;
import com.NykaaCucumber_IPT.pom.PageObjectManager;

import io.cucumber.java.en.Given;
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
}
