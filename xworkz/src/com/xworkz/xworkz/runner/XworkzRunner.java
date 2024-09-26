package com.xworkz.xworkz.runner;

import com.xworkz.xworkz.boot.Xworkz;

public class XworkzRunner {
public static void main(String [] args) {
		
		Xworkz xworkz=new Xworkz();
		xworkz.work();
		xworkz.work("");
		xworkz.work("akshara",6);
		xworkz.work("akshara",6,20000.0f);
		xworkz.work("akshara",6,20000.0f,'D');
		xworkz.work("akshara",6,200000.0f,'D',23965l);
		xworkz.work("akshara",6,200000.0f,'D',23965l,true);
		xworkz.work("akshara",6,200000.0f,'D',23965l,true,10000000.0d);
	}

}

