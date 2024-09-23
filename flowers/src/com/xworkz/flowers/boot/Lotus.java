package com.xworkz.flowers.boot;

public class Lotus extends Jasmin{
	public String color="pink";
    
    
    public void lotus(){
   
    	System.out.println("before applying super" +this.color);
    	System.out.println("after applying" +super.color);
    }
   
	
}
