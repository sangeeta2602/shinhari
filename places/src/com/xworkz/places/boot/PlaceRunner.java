package com.xworkz.places.boot;

public class PlaceRunner {
	public static void main(String [] args) {
		
		Place place=new Place();
		place.setPlaceName("mantralaya");
		place.setTotalDistance(386);
		System.out.println(place.getPlaceName());
		System.out.println(place.getTotalDistance());
		
	}

}
