package com.xworkz.phone.runner;

import com.xworkz.phone.boot.Iphone;
import com.xworkz.phone.boot.Samsung;

public class SamsungRunner {
	
	public static void main(String [] args) {
		
		Samsung samsung = new Samsung(190876.8987d, 16.0f);
		
		Iphone iphone = new Iphone();
		
		System.out.println("Price of Iphone :" +iphone.getPrice());
		
		System.out.println("Version :" +iphone.getVersion());
		
		
		
		
	}

}
