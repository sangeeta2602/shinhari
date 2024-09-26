package com.xworkz.mall.boot;

public class SMart extends VishalMart{
	public String areaName;
	public int floors;
	public float workers;
	public double dailyCustomers;
	public long contactNum;
	public boolean isItGoodOrNot;
	
	@Override
	public void mall(String areaName) {
		this.areaName=areaName;
		System.out.println("child mall method"+areaName);
	}
	@Override
	public void mart(String areaName,int floors) {
		this.areaName=areaName;
		this.floors=floors;
		System.out.println("child mart method"+areaName+" "+floors);
	}
	@Override
	public void shoppingMall(String areaName,int floors,float workers) {
		this.areaName=areaName;
		this.floors=floors;
		this.workers=workers;
		System.out.println("child shoppingMall method"+areaName+" "+floors+" "+workers);
	}
	@Override
	public void working(String areaName,int floors,float workers,double dailyCustomers) {
		this.areaName=areaName;
		this.floors=floors;
		this.workers=workers;
		this.dailyCustomers=dailyCustomers;
		System.out.println("child working method"+areaName+" "+floors+" "+workers+" "+dailyCustomers);
	}
	@Override
	public void purchase(String areaName,int floors,float workers,double dailyCustomers,long contactNum) {
		this.areaName=areaName;
		this.floors=floors;
		this.workers=workers;
		this.dailyCustomers=dailyCustomers;
		this.contactNum=contactNum;
		System.out.println("child purchase method"+areaName+" "+floors+" "+workers+" "+dailyCustomers+" "+contactNum);
	}
	@Override
	public void offer(String areaName,int floors,float workers,double dailyCustomers,long contactNum,boolean isItGoodOrNot) {
		this.areaName=areaName;
		this.floors=floors;
		this.workers=workers;
		this.dailyCustomers=dailyCustomers;
		this.contactNum=contactNum;
		this.isItGoodOrNot=isItGoodOrNot;
		System.out.println("child offer method"+areaName+" "+floors+" "+workers+" "+dailyCustomers+" "+contactNum+" "+isItGoodOrNot);
	}

}



