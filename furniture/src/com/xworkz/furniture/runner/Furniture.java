package com.xworkz.furniture.runner;

import com.xworkz.furniture.boot.Window;
import com.xworkz.furniture.boot.Chair;
public class Furniture {
	public int totalItems;
	public String ownerName;
	public Window window;
	public Chair chair;
	
	public static void main(String [] args) {
		Window window=new Window();
	   window.setPrice(1000);
	   window.getPrice();
	   System.out.println(window.getPrice());
	   Chair chair=new Chair();
	   chair.setBrand("shree");
	   chair.setShopName("sai furniture");
	   chair.setPrice(300);
	   chair.getBrand();
	   System.out.println(chair.getBrand());
	   chair.getShopName();
	   System.out.println(chair.getShopName());
	   chair.getPrice();
	   System.out.println(chair.getPrice());
	   
	}
	

}
