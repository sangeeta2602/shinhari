package com.xworkz.encapsulation.boot;

public class BagRunner {
	public static void main(String [] args) {
		
		Bag bag=new Bag();
		bag.setBrandName("skybag");
		System.out.println(bag.getBrandName());
		
		bag.setPrice(1000);
        System.out.println(bag.getPrice());
	}

}
