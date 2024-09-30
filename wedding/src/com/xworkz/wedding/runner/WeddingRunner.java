package com.xworkz.wedding.runner;

import com.xworkx.wedding.boot.Wedding;

public class WeddingRunner {
	public static void main(String [] args) {
		
		Wedding wedding=new Wedding();
		int details=wedding.hashcode();
		System.out.println(details);
		
	}

}
