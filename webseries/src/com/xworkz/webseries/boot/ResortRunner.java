package com.xworkz.webseries.boot;

public class ResortRunner {
	public static void main(String [] args) {
		
		Resort.clinic();
		Resort.designation();
		Resort.games();
		Resort.gym();
		Resort.houseKeeping();
		Resort.offers();
		Resort.salary();
		Resort.spa();
		Resort.swimming();
		Resort.shef();
		
		Resort resort=new MiniResort();
		resort.dish();
		resort.accounting();
		resort.electricity();
		resort.floor();
		resort.garden();
		resort.guestRoom();
		resort.manager();
		resort.workers();
		resort.owner();
		resort.rooms();
		
	}

}
