package com.xworkz.equalmethod.boot;

public class Temple {
	 public int donationMoneyForTemple;
	 public String templeLocatedArea;
	 public String godName;
	 public Boolean isGodThere;
	 public int maintanceMoney;
	 public int devoties;
	 public int totalGodsInTemple;
	 public int prasadRate;
	 public String pujariName;
	 public Boolean isTherePrasad;
	
	 public Temple(int donationMoneyForTemple, String templeLocatedArea, String godName, Boolean doesGodBlessUs,
			int maintanceMoney, int devoties, int totalGodsInTemple, int prasadRate, String pujariName,
			Boolean isTherePrasad) {
	
		this.donationMoneyForTemple = donationMoneyForTemple;
		this.templeLocatedArea = templeLocatedArea;
		this.godName = godName;
		this.isGodThere = isGodThere;
		this.maintanceMoney = maintanceMoney;
		this.devoties = devoties;
		this.totalGodsInTemple = totalGodsInTemple;
		this.prasadRate = prasadRate;
		this.pujariName = pujariName;
		this.isTherePrasad = isTherePrasad;
	}
	public boolean equals(Object obj) {
		 if(this==obj) {
			 return true;
		 }
		 if(obj == null || getClass() !=obj.getClass()) {
			 return false;
		 }
		 Temple temple=(Temple) obj;
		 
		 return templeLocatedArea.equals(temple.templeLocatedArea) && donationMoneyForTemple==temple.donationMoneyForTemple && isGodThere.equals(temple.isGodThere) && godName.equals(temple.godName) && maintanceMoney==temple.maintanceMoney  && devoties==temple.devoties && totalGodsInTemple==temple.totalGodsInTemple && prasadRate==temple.prasadRate && pujariName.equals(temple.pujariName)&& isTherePrasad.equals(temple.isTherePrasad);
	}
	 
	 

}
