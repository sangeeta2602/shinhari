package com.xworkz.shree.boot;

	public class Phone extends Fan{
		   public String name;
		   public int price;
		   
		   public void setName(String name){
			super.name=name;
		}
		public void setPrice(int price){
			this.price=price;
		}
		public String getName(){
			return super.name;
		}
		public int getPrice(){
			return super.price;
		}




		}


