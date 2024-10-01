package com.xworkz.equalmethod.boot;

public class Gold {
	 public String nameOfShop;
	 public int totalShops;
	 public float gst;
	 public String largestGoldMiningPlace ;
	public int goldPrice;
	 public int formsOfGold ;
	 public int typesOfGold;
	 public int typesOfMining;
	 public Boolean isItDuctile;
	 public Boolean pureOrNot;
	 
public Gold(String nameOfShop, int totalShops, float gst, String largestGoldMiningPlace, int goldPrice,
			int formsOfGold, int typesOfGold, int typesOfMining, Boolean isItDuctile, Boolean pureOrNot) {
		this.nameOfShop = nameOfShop;
		this.totalShops = totalShops;
		this.gst = gst;
		this.largestGoldMiningPlace = largestGoldMiningPlace;
		this.goldPrice = goldPrice;
		this.formsOfGold = formsOfGold;
		this.typesOfGold = typesOfGold;
		this.typesOfMining = typesOfMining;
		this.isItDuctile = isItDuctile;
		this.pureOrNot = pureOrNot;
	}

public boolean equals(Object obj) {
	 if(this==obj) {
		 return true;
	 }
	 if(obj == null || getClass() !=obj.getClass()) {
		 return false;
	 }
	 Gold gold=(Gold) obj;
	 
	 return nameOfShop.equals(gold.nameOfShop) && totalShops==gold.totalShops && gst==gold.gst && largestGoldMiningPlace.equals(gold.largestGoldMiningPlace) && goldPrice==gold.goldPrice  && formsOfGold==gold.formsOfGold && typesOfGold==gold.typesOfGold && typesOfMining==gold.typesOfMining && isItDuctile.equals(gold.isItDuctile)&& pureOrNot.equals(gold.pureOrNot);
}
}
