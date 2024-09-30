package com.xworkz.bangalore.runner;

import com.xworkz.bangalore.boot.Bangalore;

public class BangaloreRunner {
     public static void main(String [] args) {
    	 
    	 Bangalore bangalore=new Bangalore();
    	 String details=bangalore.toString("kempegowda",45,"678sqf",35.f,15.d,100,2345654356l,true,"silicon city",2,30.f,"shreeHarsha majety",15,56.f,1537,"mr.raghavendra rao",4,31.f,100,true,148,"prashant",200,34567765678l,100,30,26.f,60.d,59,"chinnaswamy stadium",3,"iscon temple",30.f,49,2,"reva university");
    	 
    	 System.out.println(details);
     
     }
}
