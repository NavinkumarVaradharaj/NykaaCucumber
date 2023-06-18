package com.NykaaCucumber_IPT.pom;

public interface BagPage {
	
	String open_bag_icon_xpath = "//div[@class='css-0 e1ewpqpu1']/button";
	
	String frame_xpath = "//iframe[@class='css-acpm4k']";
	
	String quantity_xpath = "//div[@class='css-1gnoynr e1whhlt6']//img";
	
	String select_quantity_xpath = "//li[@class='css-18fuhjc edkwwn3']//div[contains(@class, 'css-pobka1')]";
	
	String proceed_btn_xpath = "//span[text() = 'Proceed']";

	String deliverHere_btn_xpath = "//button[text()='Deliver here']";
	
	String remove_icon_xpath = "//div[@data-test-id='product-remove']";
	
	String remove_btn_xpath = "//button[text()='Remove']";
	
}
