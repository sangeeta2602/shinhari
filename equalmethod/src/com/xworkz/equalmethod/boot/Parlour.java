package com.xworkz.equalmethod.boot;

public class Parlour {
	 public String parlourName;
	 public int facialPrice;
	 public String ownerName;
	 public Boolean isItWorth;
	 public String productName;
	 public int totalFacials;
	 public int ageOfOwner;
	 public int rentForShop;
	 public String locatedAreaName;
	 public Boolean isItNear;
	
	 public Parlour(String parlourName, int facialPrice, String ownerName, Boolean isItWorth, String productName,
			int totalFacials, int ageOfOwner, int rentForShop, String locatedAreaName, Boolean isItNear) {
		this.parlourName = parlourName;
		this.facialPrice = facialPrice;
		this.ownerName = ownerName;
		this.isItWorth = isItWorth;
		this.productName = productName;
		this.totalFacials = totalFacials;
		this.ageOfOwner = ageOfOwner;
		this.rentForShop = rentForShop;
		this.locatedAreaName = locatedAreaName;
		this.isItNear = isItNear;
	}
	public boolean equals(Object obj) {
		 if(this==obj) {
			 return true;
		 }
		 if(obj == null || getClass() !=obj.getClass()) {
			 return false;
		 }
		 Parlour parlour=(Parlour) obj;
		 
		 return parlourName.equals(parlour.parlourName) && facialPrice==parlour.facialPrice && isItWorth.equals(parlour.isItWorth) && ownerName.equals(parlour.ownerName) && productName.equals(parlour.productName)  && totalFacials==parlour.totalFacials && ageOfOwner==parlour.ageOfOwner && rentForShop==parlour.rentForShop && locatedAreaName.equals(parlour.locatedAreaName)&& isItNear.equals(parlour.isItNear);
	}
	 
	 
}
