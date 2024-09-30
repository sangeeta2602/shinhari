package com.xworkz.wedding.runner;

import com.xworkx.wedding.boot.Wedding;

public class WeddingRunner {
	public static void main(String [] args) {
		
		Wedding wedding=new Wedding(3,500,27,25,25,20,26000,345677654l,true,200,400.0d,400,150,100,200.0d,130.0f,26,true,1000,1000000.0f,567654567887l,14,23,25000.0f,500000.d,10000.d,30000,4,300000.d,3455,25000.d,10);
		int details=wedding.hashcode();
		System.out.println(details);
		System.out.println(wedding.toString());
	}

}
