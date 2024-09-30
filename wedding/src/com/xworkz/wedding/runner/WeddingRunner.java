package com.xworkz.wedding.runner;

import com.xworkx.wedding.boot.Wedding;

public class WeddingRunner {
	public static void main(String [] args) {
		
		Wedding wedding=new Wedding(3,500,27,25,25,20,26000,345677654l,true,200,400,400,150,100,200,130,26,true,1000,1000000,567654567887l,14,23,25000,500000,10000,30000,4,300000,3455,25000,10);
		int details=wedding.hashcode();
		System.out.println(details);
		System.out.println(wedding.toString());
	}

}
