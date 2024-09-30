package com.xworkz.bangalore.runner;

import com.xworkz.bangalore.boot.Bangalore;

public class BangaloreRunner {
     public static void main(String [] args) {
    	 
    	 Bangalore bangalore=new Bangalore("kempegowda",678.0f,35,15,100,45,2345654356l,true,"silicon city",2,30,"shreeHarsha majety",15,56,1537,"mr.raghavendra rao",4,36,100,true,148,"prashant",200,34567765678l,100,30,26,60,59,"chinnaswamy stadium",3,"iscon temple",30,49,2,"reva university");
		int details=bangalore.hashcode();
 		System.out.println(details);
 		System.out.println(bangalore.toString());
 	}
}
