package com.xworkz.makeup.root;

public class Lakme {
	public String productName;
	public int totalProduct;
	public float price;
	public double varieties;
	public long productNum;
	public boolean isItWaterproof;
	
	public void lipstic(String productName) {
		this.productName=productName;
		System.out.println("parent lipstic method"+productName);
	}
	public void eyelinear(String productName,int totalProduct) {
		this.productName=productName;
		this.totalProduct=totalProduct;
		System.out.println("parent eyelinear method"+productName+" "+totalProduct);
	}
	public void foundation(String productName,int totalProduct,float price) {
		this.productName=productName;
		this.totalProduct=totalProduct;
		this.price=price;
		System.out.println("parent foundation method"+productName+" "+totalProduct+" "+price);
	}
	public void moisturizer(String productName,int totalProduct,float price,double varieties) {
		this.productName=productName;
		this.totalProduct=totalProduct;
		this.price=price;
		this.varieties=varieties;
		System.out.println("parent moisturizer method"+productName+" "+totalProduct+" "+price+" "+varieties);
	}
	public void serum(String productName,int totalProduct,float price,double varieties,long productNum ) {
		this.productName=productName;
		this.totalProduct=totalProduct;
		this.price=price;
		this.varieties=varieties;
		this.productNum=productNum;
		System.out.println("parent serum method"+productName+" "+totalProduct+" "+price+" "+varieties+" "+productNum);
	}
	public void compact(String productName,int totalProduct,float price,double varieties,long productNum,boolean isItWaterproof) {
		this.productName=productName;
		this.totalProduct=totalProduct;
		this.price=price;
		this.varieties=varieties;
		this.productNum=productNum;
		this.isItWaterproof=isItWaterproof;
		System.out.println("parent compact method"+productName+" "+totalProduct+" "+price+" "+varieties+" "+productNum+" "+isItWaterproof);
	}

}
