package com.xworkz.director.boot;

public class Producer1{
	
	public String movieName;
	public int age;
	public float Budget;
	public char performance;
	public long contactNum;
	public boolean isItMassMovie;
	public double movieProfitAmount;
	public Producer1( ) {
		this("sari podha shanivaram");	
	}
	public Producer1(String movieName) {
	this("sari podha shanivaram",45);
	}
	public Producer1(String movieName,int age) {
		this("sari podha shanivaram",45,100000000.0f);
	}
	public Producer1(String movieName,int age,float movieBudget) {
		this("sari podha shanivaram",45,100000000.0f,'a');
	}
	public Producer1(String movieName,int age,float movieBudget,char performance) {
		this("sari podha shanivaram",45,100000000.0f,'a',643678965l);
	}
	public Producer1(String movieName,int age,float movieBudget,char performance,long contactNum) {
		this("sari podha shanivaram",45,100000000.0f,'a',643678965l,true);
	}
	public Producer1(String movieName,int age,float movieBudget,char performance,long contactNum,boolean isItMassMovie) {
		this("sari podha shanivaram",45,100000000.0f,'a',643678965l,true,100000000000.0d);
	}
	public Producer1(String movieName,int age,float movieBudget,char performance,long contactNum,boolean isItMassMovie,double movieProfitAmount) {
		
	}
	public void producer() {
		
	}
	
	public void producer(String movieName) {
		this.movieName=movieName;	
		System.out.println("1st method"+this.movieName);
	}
	public void  producer(String movieName,int age) {
		this.movieName=movieName;
		this.age=age;
		System.out.println("2nd method"+this.age);
	}
	public void Producer(String movieName,int age,float Budget) {
		this.movieName=movieName;
		this.age=age;
		this.Budget=Budget;
		System.out.println("3rd method"+this.Budget);
	}
	public void producer(String movieName,int age,float movieBudget,char performance) {
		this.movieName=movieName;
		this.age=age;
		this.Budget=Budget;
		this.performance=performance;
		System.out.println("4th method"+this.performance);
	}
	public void producer(String movieName,int age,float movieBudget,char performance,long contactNum) {
		this.movieName=movieName;
		this.age=age;
		this.Budget=Budget;
		this.performance=performance;
		this.contactNum=contactNum;
		System.out.println("5th method"+this.contactNum);
	}
	public void producer(String movieName,int age,float movieBudget,char performance,long contactNum,boolean isItMassMovie) {
		this.movieName=movieName;
		this.age=age;
		this.Budget=Budget;
		this.performance=performance;
		this.contactNum=contactNum;
		this.isItMassMovie=isItMassMovie;
		System.out.println("6th method"+this.isItMassMovie);
	}
	public void producer(String movieName,int age,float movieBudget,char performance,long contactNum,boolean isItMassMovie,double movieProfitAmount ) {
	this.age=age;
	this.Budget=Budget;
	this.performance=performance;
	this.contactNum=contactNum;
	this.isItMassMovie=isItMassMovie;
	this.movieProfitAmount=movieProfitAmount;
	System.out.println("7th method"+this.movieProfitAmount);
		
	}
}
