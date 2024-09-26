package com.xworkz.mall.boot;

public class VishalMart {
	public String areaName;
	public int floors;
	public float workers;
	public double dailyCustomers;
	public long contactNum;
	public boolean isItGoodOrNot;
	
	public void mall(String areaName) {
		this.areaName=areaName;
		System.out.println("parent mall method"+areaName);
	}
	public void mart(String areaName,int floors) {
		this.areaName=areaName;
		this.floors=floors;
		System.out.println("parent mart method"+areaName+" "+floors);
	}
	public void shoppingMall(String areaName,int floors,float workers) {
		this.areaName=areaName;
		this.floors=floors;
		this.workers=workers;
		System.out.println("parent shoppingMall method"+areaName+" "+floors+" "+workers);
	}
	public void working(String areaName,int floors,float workers,double dailyCustomers) {
		this.areaName=areaName;
		this.floors=floors;
		this.workers=workers;
		this.dailyCustomers=dailyCustomers;
		System.out.println("parent working method"+areaName+" "+floors+" "+workers+" "+dailyCustomers);
	}
	public void purchase(String areaName,int floors,float workers,double dailyCustomers,long contactNum) {
		this.areaName=areaName;
		this.floors=floors;
		this.workers=workers;
		this.dailyCustomers=dailyCustomers;
		this.contactNum=contactNum;
		System.out.println("parent shoppingMall method"+areaName+" "+floors+" "+workers+" "+dailyCustomers+" "+contactNum);
	}
	public void offer(String areaName,int floors,float workers,double dailyCustomers,long contactNum,boolean isItGoodOrNot) {
		this.areaName=areaName;
		this.floors=floors;
		this.workers=workers;
		this.dailyCustomers=dailyCustomers;
		this.contactNum=contactNum;
		this.isItGoodOrNot=isItGoodOrNot;
		System.out.println(" parent offer method"+areaName+" "+floors+" "+workers+" "+dailyCustomers+" "+contactNum+" "+isItGoodOrNot);
	}

}

