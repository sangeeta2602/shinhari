package com.xworkz.sports.boot;

public class Olympics {
	public String sportsName;
	public int totalGames;
	public float totalGuest;
	public char year;
	public long participants;
	public boolean isNationalOrNot;
	public double priceAmount;
	public Olympics( ) {
		this("Relay ");	
	}
	public Olympics(String sportsName) {
	this("Relay",32);
	}
	public Olympics(String sportsName,int totalGames) {
		this("Relay",32,100000000.0f);
	}
	public Olympics(String sportsName,int totalGames,float totalGuest) {
		this("Relay",32,100000000.0f,'D');
	}
	public Olympics(String sportsName,int totalGames,float totalGuest,char year) {
		this("Relay",32,100000000.0f,'D',23965l);
	}
	public Olympics(String sportsName,int totalGames,float totalGuest,char year,long participants) {
		this("Relay",32,100000000.0f,'D',23965l,true);
	}
	public Olympics(String sportsName,int totalGames,float totalGuest,char year,long participants,boolean isNationalOrNot) {
		this("Relay",32,100000000.0f,'D',23965l,true,10000000.0d);
	}
	public Olympics(String sportsName,int totalGames,float totalGuest,char year,long participants,boolean isNationalOrNot,double movieProfitAmount) {
		
	}
	public void game() {
      
	}
	public void game(String sportsName) {
		this.sportsName=sportsName;	
	}
	public void  game(String sportsName,int totalGames) {
		this.sportsName=sportsName;
		this.totalGames=totalGames;
	}
	public void game(String sportsName,int totalGames,float totalGuest) {
		this.sportsName=sportsName;
		this.totalGames=totalGames;
		this.totalGuest=totalGuest;
		System.out.println("4th method"+this.totalGuest);
	}
	public void game(String sportsName,int totalGames,float totalGuest,char year) {
		this.sportsName=sportsName;
		this.totalGames=totalGames;
		this.totalGuest=totalGuest;
		this.year=year;
		System.out.println("5th method"+this.year);
	}
	public void game(String movieName,int totalGames,float totalGuest,char year,long participants) {
		this.sportsName=sportsName;
		this.totalGames=totalGames;
		this.totalGuest=totalGuest;
		this.year=year;
		this.participants=participants;
		System.out.println("6th method"+this.participants);
	}
	public void game(String sportsName,int totalGames,float totalGuest,char year,long participants,boolean isItMassMovie) {
		this.sportsName=sportsName;
		this.totalGames=totalGames;
		this.totalGuest=totalGuest;
		this.year=year;
		this.participants=participants;
		this.isNationalOrNot=isNationalOrNot;
		System.out.println("6th method"+this.isNationalOrNot);
	}
	public void game(String sportsName,int totalGames,float totalGuest,char year,long contactNum,boolean isItMassMovie,double priceAmount ) {
    this.sportsName=sportsName;		  
	this.totalGames=totalGames;
	this.totalGuest=totalGuest;
	this.year=year;
	this.participants=participants;
	this.isNationalOrNot=isNationalOrNot;
	this.priceAmount=priceAmount;
	System.out.println("6th method"+this.priceAmount);
		
	}
}



