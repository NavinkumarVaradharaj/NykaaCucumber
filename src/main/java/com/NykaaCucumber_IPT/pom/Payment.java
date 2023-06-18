package com.NykaaCucumber_IPT.pom;

public interface Payment {
	
	String card_number_input_xpath = "//input[@placeholder='Card Number']";

	String expiry_input_xpath = "//input[@placeholder='Expiry (MM/YY)']";
	
	String cvv_input_xpath = "//input[@placeholder='CVV']";
	
	String pay_btn_xpath = "//button[contains(text() ,'Pay')]";
	
	String close_btn_xpath = "//button[text()='Close']";
	
	String open_bag_xpath = "//p[text() = 'Bag']";
	
	String edit_bag_xpath = "//p[text() = 'Edit']";
	
}










