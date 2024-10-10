package com.xworkz.webseries.boot;

public class HouseRunner {
	public static void main(String [] agr) {
		
		ProductionHouse.designers();
		ProductionHouse.direction();
		ProductionHouse.investers();
		ProductionHouse.mediaOwnership();
		ProductionHouse.studioSystem();
		ProductionHouse.staff();
		ProductionHouse.script();
		ProductionHouse.publisher();
		ProductionHouse.partner();
		ProductionHouse.owner();
		
		ProductionHouse house=new House();
		house.comics();
		house.intractiveArt();
		house.movie();
		house.music();
		house.producer();
		house.radio();
		house.television();
		house.website();
		house.videoGames();
		house.video();
	}

}
