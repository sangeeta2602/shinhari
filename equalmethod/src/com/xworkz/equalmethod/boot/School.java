package com.xworkz.equalmethod.boot;

public class School {
	 public String schoolName;
	 public int fees;
	 public String schoolLocatedArea;
	 public Boolean isItPrivate;
	 public String crName;
	 public int classStrength;
	 public Boolean isItNear;
	 public String whichClass;
	 public String classTeacherName;
	 public int totalSchoolStaff;
	
	 public School(String schoolName, int fees, String schoolLocatedArea, Boolean isItPrivate, String crName,
			int classStrength, Boolean isItNear, String whichClass, String classTeacherName, int totalSchoolStaff) {
		this.schoolName = schoolName;
		this.fees = fees;
		this.schoolLocatedArea = schoolLocatedArea;
		this.isItPrivate = isItPrivate;
		this.crName = crName;
		this.classStrength = classStrength;
		this.isItNear = isItNear;
		this.whichClass = whichClass;
		this.classTeacherName = classTeacherName;
		this.totalSchoolStaff = totalSchoolStaff;
	}
	public boolean equals(Object obj) {
		 if(this==obj) {
			 return true;
		 }
		 if(obj == null || getClass() !=obj.getClass()) {
			 return false;
		 }
		 School school=(School) obj;
		 
		 return schoolName.equals(school.schoolName) && fees==school.fees && schoolLocatedArea.equals(school.schoolLocatedArea) && isItPrivate.equals(school.isItPrivate) && crName.equals(school.crName)  && classStrength==school.classStrength && isItNear.equals(school.isItNear) && whichClass.equals(school.whichClass) && classTeacherName.equals(school.classTeacherName) && totalSchoolStaff==school.totalSchoolStaff;
	 }
	 

}
