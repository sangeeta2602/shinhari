package com.xworkz.makeup.root;

public class Mamaearth extends Lakme{
	public String productName;
	public int totalProduct;
	public float price;
	public double varieties;
	public long productNum;
	public boolean isItWaterproof;
	
	@Override
	public void lipstic(String productName) {
		this.productName=productName;
		System.out.println("child lipstic method"+productName);
	}
	@Override
	public void eyelinear(String productName,int totalProduct) {
		this.productName=productName;
		this.totalProduct=totalProduct;
		System.out.println("child eyelinear method"+productName+" "+totalProduct);
	}
	@Override
	public void foundation(String productName,int totalProduct,float price) {
		this.productName=productName;
		this.totalProduct=totalProduct;
		this.price=price;
		System.out.println("child foundation method"+productName+" "+totalProduct+" "+price);
	}
	@Override
	public void moisturizer(String productName,int totalProduct,float price,double varieties) {
		this.productName=productName;
		this.totalProduct=totalProduct;
		this.price=price;
		this.varieties=varieties;
		System.out.println("child moisturizer method"+productName+" "+totalProduct+" "+price+" "+varieties);
	}
	@Override
	public void serum(String productName,int totalProduct,float price,double varieties,long productNum) {
		this.productName=productName;
		this.totalProduct=totalProduct;
		this.price=price;
		this.varieties=varieties;
		this.productNum=productNum;
		System.out.println("child serum method"+productName+" "+totalProduct+" "+price+" "+varieties+" "+productNum);
	}
	@Override
	public void compact(String productName,int totalProduct,float price,double varieties,long productNum,boolean isItWaterproof) {
		this.productName=productName;
		this.totalProduct=totalProduct;
		this.price=price;
		this.varieties=varieties;
		this.productNum=productNum;
		this.isItWaterproof=isItWaterproof;
		System.out.println("child compact method"+productName+" "+totalProduct+" "+price+" "+varieties+" "+productNum+" "+isItWaterproof);
	}

}
