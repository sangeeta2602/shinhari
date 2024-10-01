package com.xworkz.equalmethod.boot;

public class Vegetable {
	public int tomatoRate;
	 public String marketName;
	 public int potatoRate;
	 public Boolean isMarketNearOrNot;
	 public String vegetableSellerName;
	 public int totalVegetables;
	public int chilliRate;
	public int dailyIncome;
	 public String marketlocatedArea;
	 public Boolean isVegetablesAreFresh;
	public Vegetable(int tomatoRate, String marketName, int potatoRate, Boolean isMarketNearOrNot,
			String vegetableSellerName, int totalVegetables, int chilliRate, int kCetStudentsStrength,
			String marketlocatedArea, Boolean isVegetablesAreFresh) {
		this.tomatoRate = tomatoRate;
		this.marketName = marketName;
		this.potatoRate = potatoRate;
		this.isMarketNearOrNot = isMarketNearOrNot;
		this.vegetableSellerName = vegetableSellerName;
		this.totalVegetables = totalVegetables;
		this.chilliRate = chilliRate;
		this.dailyIncome = dailyIncome;
		this.marketlocatedArea = marketlocatedArea;
		this.isVegetablesAreFresh = isVegetablesAreFresh;
	}
	 
	public boolean equals(Object obj) {
		 if(this==obj) {
			 return true;
		 }
		 if(obj == null || getClass() !=obj.getClass()) {
			 return false;
		 }
		 Vegetable veg=(Vegetable) obj;
		 
		 return marketName.equals(veg.marketName) && tomatoRate==veg.tomatoRate && potatoRate==veg.potatoRate && isMarketNearOrNot.equals(veg.isMarketNearOrNot) && totalVegetables==veg.totalVegetables  && vegetableSellerName.equals(veg.vegetableSellerName) && chilliRate==veg.chilliRate && dailyIncome==veg.dailyIncome && marketlocatedArea.equals(veg.marketlocatedArea) && isVegetablesAreFresh.equals(veg.isVegetablesAreFresh);
	 }
   
}
