package com.xworkz.jwellary.runner;

import com.xworkz.jwellary.boot.Jwellary;
import com.xworkz.jwellary.boot.Bhima;

public class JwellaryRunner extends Jwellary {
	public static void main(String [] args) {
		
		JwellaryRunner jwellary=new JwellaryRunner();
		jwellary.setFounderName("bhima bhatter");
		System.out.println(jwellary.getFounderName());
		
		jwellary.setPrice(150000);
		System.out.println(jwellary.getPrice());
		
		jwellary.setJwellaryType("short necklace");
		System.out.println(jwellary.getJwellaryType());
		
		jwellary.setTotalYears(50);
		System.out.println(jwellary.getTotalYears());
	}
}
