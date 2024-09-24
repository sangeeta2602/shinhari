package com.xworkz.biscuit.runner;



public class Biscuit {
     private String name;
     private int price;
	private String getName() {
		return name;
	}
	private int getPrice() {
		return price;
	}
	private void setName(String name) {
		this.name = name;
	}
	private void setPrice(int price) {
		this.price = price;
	}
	public static void main(String [] args) {
		Biscuit biscuit=new Biscuit();
		biscuit.setName("parle-G");
		biscuit.setPrice(10);
		System.out.println(biscuit.getPrice());
		System.out.println(biscuit.getName());
	}
    
}

