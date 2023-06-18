package com.NykaaCucumber_IPT.pom;

import com.NykaaCucumber_IPT.base.BaseClass;

public class PageObjectManager extends BaseClass {
	
	private PageObjectManager() {
		
	}
	
	private HomePageImpl home_page;
	private ProductPageImpl product_page;
	private BagPageImpl bag_page;
	private PaymentPageImpl payment_page;
	private LoginPageImpl login_page;
	private static PageObjectManager pom;
	
	public HomePageImpl getHome_page() {
		if(home_page == null) {
			home_page = new HomePageImpl();
		}
		return home_page;
	}
	public ProductPageImpl getProduct_page() {
		if(product_page == null) {
			product_page = new ProductPageImpl();
		}
		return product_page;
	}
	public BagPageImpl getBag_page() {
		if(bag_page == null) {
			bag_page = new BagPageImpl();
		}
		return bag_page;
	}
	public PaymentPageImpl getPayment_page() {
		if(payment_page == null) {
			payment_page = new PaymentPageImpl();
		}
		return payment_page;
	}
	public LoginPageImpl getLogin_page() {
		if(login_page == null) {
			login_page = new LoginPageImpl();
		}
		return login_page;
	}
	public static PageObjectManager getPom() {
		if(pom == null) {
			pom = new PageObjectManager();
		}
		return pom;
	}
	

}
