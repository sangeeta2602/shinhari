package com.xworkz.xworkz.boot;

public class Xworkz {
	public String hrName;
	public int totalFaculty;
	public float fees;
	public char section;
	public long contactNum;
	public boolean isItNearOrFar;
	public double strengthOfStudents;
	public Xworkz() {
		this("akshara");
	}
public Xworkz(String hrName) {
		this("akshara",6);
	}
public Xworkz(String hrName,int totalFaculty) {
	this("akshara",6,25000.f);
}
public Xworkz(String hrName,int totalFaculty,float fees) {
	this("akshara",6,25000.f,'A');
}
public Xworkz(String hrName,int totalFaculty,float fees,char section) {
	this("akshara",6,25000.f,'A',4356784385l);
}
public Xworkz(String hrName,int totalFaculty,float fees,char section,long contactNum) {
	this("akshara",6,25000.f,'A',4356784385l,false);
}
public Xworkz(String hrName,int totalFaculty,float fees,char section,long contactNum,boolean isItNearOrFar) {
	this("akshara",6,25000.f,'A',4356784385l,false,1000.d);
}
public Xworkz(String hrName,int totalFaculty,float fees,char section,long contactNum,boolean isItNearOrFar,double strengthOfStudents) {
	
}
public void work() {
	
}
public void work(String hrName) {
	this.hrName=hrName;
	System.out.println("1st mthod"+this.hrName);
}
public void work(String hrName,int totalFaculty) {
	this.hrName=hrName;
	this.totalFaculty=totalFaculty;
	System.out.println("2nd method"+this.totalFaculty);
}
public void work(String hrName,int totalFaculty,float fees) {
	this.hrName=hrName;
	this.totalFaculty=totalFaculty;
	this.fees=fees;
	System.out.println("2nd method"+this.fees);
}

public void work(String hrName,int totalFaculty,float fees,char section) {
	this.hrName=hrName;
	this.totalFaculty=totalFaculty;
	this.fees=fees;
	this.section=section;
	System.out.println("3rd method"+this.section);
}
public void work(String hrName,int totalFaculty,float fees,char section,long contactNum) {
	this.hrName=hrName;
	this.totalFaculty=totalFaculty;
	this.fees=fees;
	this.section=section;
	this.contactNum=contactNum;
	System.out.println("4th method"+this.contactNum);
	
}
public void work(String hrName,int totalFaculty,float fees,char section,long contactNum,boolean isItNearOrFar) {
	this.hrName=hrName;
	this.totalFaculty=totalFaculty;
	this.fees=fees;
	this.section=section;
	this.contactNum=contactNum;
	this.isItNearOrFar=isItNearOrFar;
	System.out.println("5th method"+this.isItNearOrFar);
}
public void work(String hrName,int totalFaculty,float fees,char section,long contactNum,boolean isItNearOrFar,double strengthOfStudents) {
	this.hrName=hrName;
	this.totalFaculty=totalFaculty;
	this.fees=fees;
	this.section=section;
	this.contactNum=contactNum;
	this.isItNearOrFar=isItNearOrFar;
	this.strengthOfStudents=strengthOfStudents;
	System.out.println("5th method"+this.strengthOfStudents);
}

}
