package com.shinhari.School.boot;

public class School {
   public float noOfStudents;
   public double fees;
   public boolean isItPrivate;
   
public float getNoOfStudents() {
	return noOfStudents;
}
public void setNoOfStudents(float noOfStudents) {
	this.noOfStudents = noOfStudents;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
public boolean isItPrivate() {
	return isItPrivate;
}
public void setItPrivate(boolean isItPrivate) {
	this.isItPrivate = isItPrivate;
}
public School(float noOfStudents, double fees, boolean isItPrivate) {
	super();
	this.noOfStudents = noOfStudents;
	this.fees = fees;
	this.isItPrivate = isItPrivate;
}

}