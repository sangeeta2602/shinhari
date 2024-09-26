package com.xworkz.mall.runner;

import com.xworkz.mall.boot.SMart;

public class VishalMartRunner {
	public static void main(String [] args) {
		
		SMart mart=new SMart();
		mart.mall("yelahanka");
		mart.mart("yelahanka",4);
		mart.shoppingMall("yelahanka",4,18);
		mart.working("yelahanka",4,18,500.f);
		mart.purchase("yelahanka",4,18,500.f,5456789876l);
		mart.offer("yelahanka",4,18,500.f,934567895l,true);
	}

}
