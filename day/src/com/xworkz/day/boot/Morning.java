package com.xworkz.day.boot;

public class Morning {

	 public float wakingTime;
	 public String breakfastName;
	 public int intakeOfTea;
	 
	public Morning(){
		this("dosa");        
	System.out.println("1st constructor");
	}
	
	public Morning(String name) {
		this(2);
		breakfastName=name;
		System.out.println("2nd constructor"+ " "+name);
	}
	public Morning(int tea) {
	     intakeOfTea=tea;
		System.out.println("3rd constructor"+" "+tea);
		
	}
}
	

	
