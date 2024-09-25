package com.xworkz.climate.runner;

import com.xworkz.climate.boot.College;
import com.xworkz.climate.boot.Student;

public class StudentRunner {
	public static void main(String [] args) {
		
		College clg=new Student();
		clg.setClgName("REVA UNIVERSITY");
		System.out.println(clg.getClgName());
		
		clg.setItPrivateOrPublic(true);
	     System.out.println(clg.isItPrivateOrPublic);
	     
	     clg.setNoOfBranches(200);
	     System.out.println(clg.getNoOfBranches());
	     
	     Student stud= (Student) new College();
	     
	     stud.setSrnNo("R21EK034");
	     System.out.println(stud.getSrnNo());
	     stud.setStudName("sangeeta");
	     System.out.println(stud.getSrnNo());
	     
	}

}
