package com.xworkz.tree.runner;

import com.xworkz.tree.boot.Seed;

public class PlantRunner {
	public static void main(String [] args) {
		
		Seed seed=new Seed();
		seed.setNameOfSeed("apple seed");
		System.out.println(seed.getNameOfSeed());
		seed.setPrice(100);
		System.out.println(seed.getPrice());
		
	}

}
