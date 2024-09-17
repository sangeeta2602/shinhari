package com.xworkz.movie.boot;

public class KannadaMovie extends HindiMovie {
	public static void main(String [] args) {
		
		HindiMovie hindi=new HindiMovie("ega",100000.0d,"sudeep");
		hindi.movieName="ega-2";
		
	System.out.println(hindi.getBudget()); //method
		System.out.println(hindi.movieName); //variable
		
	
		
		
		
	}

}
