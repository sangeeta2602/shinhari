package com.xworkz.wedding.runner;

import com.xworkx.wedding.boot.Wedding;

public class WeddingRunner {
	public static void main(String [] args) {
		
		Wedding wedding=new Wedding(3,500,27,25,25,20,26000,345677654l,true,200,400.d,400.d);
		int details=wedding.hashcode();
		System.out.println(details);
		
	}

}
