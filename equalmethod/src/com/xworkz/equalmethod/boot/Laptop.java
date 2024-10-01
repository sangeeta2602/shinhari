package com.xworkz.equalmethod.boot;

public class Laptop {

	 public String name;
	 public int price;
	 public String model;
	 public Boolean isItGood;
	 public String storageCapacity;
	 public int processor;
	 public int totalram;
	 public String shopName;
	 public Boolean isItwaranteed;
	 public String laptopColor;
	public Laptop(String name, int price, String model, Boolean isItGood, String storageCapacity, int processor,
			int totalram, String shopName, Boolean isItwaranteed, String laptopColor) {

		this.name = name;
		this.price = price;
		this.model = model;
		this.isItGood = isItGood;
		this.storageCapacity = storageCapacity;
		this.processor = processor;
		this.totalram = totalram;
		this.shopName = shopName;
		this.isItwaranteed = isItwaranteed;
		this.laptopColor = laptopColor;
	}
	public boolean equals(Object obj) {
		 if(this==obj) {
			 return true;
		 }
		 if(obj == null || getClass() !=obj.getClass()) {
			 return false;
		 }
		  
			Laptop  laptop=(Laptop) obj;
			 
			 return name.equals(laptop.name) && price==laptop.price && model.equals(laptop.model) && isItGood.equals(laptop.isItGood) && processor==laptop.processor  && storageCapacity.equals(laptop.storageCapacity) && totalram==laptop.totalram && shopName.equals(laptop.shopName) && isItwaranteed.equals(laptop.isItwaranteed) && laptopColor.equals(laptop.laptopColor);
		 
		 
	 }

	 
	 
}
