package com.xworkz.tree.boot;

public class Plant extends Tree{
	public String plantName;
	public int price;
	
	public Plant(){
		
	}
	public String getPlantName() {
		return plantName;
	}
	public int getPrice() {
		return price;
	}
	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
