package com.shinhari.market.runner;

import com.shinhari.market.boot.Market;
import com.shinhari.market.boot.Farmer;

public class MarketRunner {
	public static void main(String []  args) {
		
	Market market=new Market(30,"fresh vegetables",true);
	Farmer farmer=new Farmer(5,"saturday");
	System.out.println(farmer.getTotalVegSupplied());
	System.out.println(market.getTomatoRate());
	

	}

}
