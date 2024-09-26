package com.xworkz.sports.runner;

import com.xworkz.sports.boot.Olympics;

public class OlympicsRunner {
	public static void main(String [] args) {
		
		Olympics olympics=new Olympics();
		olympics.game();
		olympics.game("Relay");
		olympics.game("Relay",32);
		olympics.game("Relay",32,20000000.0f);
		olympics.game("Relay",32,20000000.0f,'D');
		olympics.game("Relay",32,20000000.0f,'D',23965l);
		olympics.game("Relay",32,20000000.0f,'D',23965l,true);
		 olympics.game("Relay",32,20000000.0f,'D',23965l,true,10000000.0d);
	}

}
