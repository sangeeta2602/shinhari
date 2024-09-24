package com.xworkz.fruit.runner;

import com.xworkz.fruit.boot.Fruit;

public class FruitRunner {
	public static void main(String [] args) {
		
		Fruit fruit=new Fruit();
		fruit.setFruitName("apple");
		fruit.setFruitsForSkin(20);
		System.out.println(fruit.getFruitName());
		System.out.println(fruit.getFruitsForSkin());
	}

}
