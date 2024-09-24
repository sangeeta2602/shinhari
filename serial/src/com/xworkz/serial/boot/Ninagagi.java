package com.xworkz.serial.boot;

public class Ninagagi extends GiniRama{
	
	public String maleCastName1;
	public String femaleCastName1;
	
	public Ninagagi(String name, String name2, String maleCastName1, String femaleCastName1) {
		super("ram","divya");
		this.maleCastName1 = maleCastName1;
		this.femaleCastName1 = femaleCastName1;
		System.out.println(super.femaleCastName);
		
	}
	public String getMaleCastName() {
		return maleCastName1;
	}
	public String getFemaleCastName() {
		return femaleCastName1;
	}
	public void setMaleCastName(String maleCastName) {
		this.maleCastName1 = maleCastName;
	}
	public void setFemaleCastName(String femaleCastName) {
		this.femaleCastName1 = femaleCastName;
	}
	
	

}
