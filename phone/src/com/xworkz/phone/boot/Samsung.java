package com.xworkz.phone.boot;

public class Samsung {
	
	public double price;
	
	public float version;
	
	public Samsung() {
		
	}

	public Samsung(double price, float version) {
		super();
		this.price = price;
		this.version = version;
	}

	public double getPrice() {
		return price;
	}

	public float getVersion() {
		return version;
	}
}
