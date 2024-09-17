package com.shinhari.market.boot;

public class Farmer {
    public int totalVegSupplied;
    public String daySupplied;
    
	public int getTotalVegSupplied() {
		return totalVegSupplied;
	}
	public void setTotalVegSupplied(int totalVegSupplied) {
		this.totalVegSupplied = totalVegSupplied;
	}
	public String getDaySupplied() {
		return daySupplied;
	}
	public void setDaySupplied(String daySupplied) {
		this.daySupplied = daySupplied;
	}
	public Farmer(int totalVegSupplied, String daySupplied) {
		super();
		this.totalVegSupplied = totalVegSupplied;
		this.daySupplied = daySupplied;
	}
    
}
