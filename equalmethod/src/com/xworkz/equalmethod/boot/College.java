package com.xworkz.equalmethod.boot;

public class College {
	public double clgFees;
	 public String clgName;
	 public String branchName;
	 public Boolean isItPrivate;
	 public String chancellorName;
	 public int totalBlocksInClg;
	 public int totalBranches;
	 public int kCetStudentsStrength;
	 public String hodName;
	 public Boolean isThereLibrary;
	
	 public College(double clgFees, String clgName, String branchName, Boolean isItPrivate, String chancellorName,
			int totalBlocksInClg, int totalBranches, int kCetStudentsStrength, String hodName, Boolean isThereLibrary) {
		this.clgFees = clgFees;
		this.clgName = clgName;
		this.branchName = branchName;
		this.isItPrivate = isItPrivate;
		this.chancellorName = chancellorName;
		this.totalBlocksInClg = totalBlocksInClg;
		this.totalBranches = totalBranches;
		this.kCetStudentsStrength = kCetStudentsStrength;
		this.hodName = hodName;
		this.isThereLibrary = isThereLibrary;
	}
	public boolean equals(Object obj) {
		 if(this==obj) {
			 return true;
		 }
		 if(obj == null || getClass() !=obj.getClass()) {
			 return false;
		 }
		 College clg=(College) obj;
		 
		 return clgName.equals(clg.clgName) && clgFees==clg.clgFees && branchName.equals(clg.branchName) && hodName.equals(clg.hodName) && totalBranches==clg.totalBranches  && isItPrivate.equals(clg.isItPrivate) && totalBlocksInClg==clg.totalBlocksInClg && kCetStudentsStrength==clg.kCetStudentsStrength && chancellorName.equals(clg.chancellorName) && isThereLibrary.equals(clg.isThereLibrary);
	 }

	
	 
}
 


