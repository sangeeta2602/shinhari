package com.xworkz.bottle.boot;

public class Student {
	public final int age=23;
	public String studName;
	
	public  void display() {
		System.out.println("age==="+age);   
	}
	public final  void exam(String studName) {
	this.studName=studName;
	System.out.println("method with final keyword=="+studName);
	}
	public static void main(String [] args) {
		Student student=new Student();
		student.exam("sangeeta");
		student.display();
	}

}
