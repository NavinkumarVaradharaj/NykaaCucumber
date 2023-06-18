package com.NykaaCucumber_IPT.pom;

public interface LoginPage {
	
	String signIn_button_xpath = "//button[text()='Sign in']";
	
	String signIn_mobile_xpath = "//button[text()='Sign in with Mobile / Email']";

	String input_mobile_name = "emailMobile";
	
	String proceed_button_id = "submitVerification";
	
	String input_otp_id = "otpField";
	
	String verify_button_xpath = "//button[text()='verify']";

}
