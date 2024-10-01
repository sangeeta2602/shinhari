package com.xworkz.equalmethod.boot;

public class Phone {
	 public String brandName;
	 public int priceOfPhone;
	 public int series;
	 public Boolean isItAffordable;
	 public int version;
	 public int onlinePrice;
	 public Boolean foldingTypeOrNot;
	 public int generation;
	 public Boolean andriodOrIphone;
	 public int storageCapacity;
	 
	public Phone(String brandName, int priceOfPhone, int series, Boolean isItAffordable, int version, int onlinePrice,
			Boolean foldingTypeOrNot, int generation, Boolean andriodOrIphone, int storageCapacity) {
	
		this.brandName = brandName;
		this.priceOfPhone = priceOfPhone;
		this.series = series;
		this.isItAffordable = isItAffordable;
		this.version = version;
		this.onlinePrice = onlinePrice;
		this.foldingTypeOrNot = foldingTypeOrNot;
		this.generation = generation;
		this.andriodOrIphone = andriodOrIphone;
		this.storageCapacity = storageCapacity;
	}
	public boolean equals(Object obj) {
		 if(this==obj) {
			 return true;
		 }
		 if(obj == null || getClass() !=obj.getClass()) {
			 return false;
		 }
		 Phone phone=(Phone) obj;
		 
		 return brandName.equals(phone.brandName) && priceOfPhone==phone.priceOfPhone && series==phone.series && isItAffordable.equals(phone.isItAffordable) && version==phone.version  && foldingTypeOrNot.equals(phone.foldingTypeOrNot) && onlinePrice==phone.onlinePrice && storageCapacity==phone.storageCapacity && andriodOrIphone.equals(phone.andriodOrIphone) && generation==phone.generation;
	 }

	
}
