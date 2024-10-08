package com.xworkz.employee.boot;

public class Mobile extends Vivo  implements Samsung{

	public void model() {
		System.out.println("model method");
		
	}
	public void version() {
		
		System.out.println("version method");
	}
	public static void main(String [] args) {
		Mobile mobile=new Mobile();
		mobile.version();
		mobile.model();
	}

	
}
