package com.xworkz.medical.boot;

public class Cardiology {
  
	public String founderName;
	public int totalStaff;
	public Dental dental;
	
	  public Cardiology(String founderName, int totalStaff, Dental dental) {
			this.founderName = founderName;
			this.totalStaff = totalStaff;
			this.dental = dental;
		}
	public void setDenntal(Dental dental) {
		this.dental=dental;
	}
	public Dental getDental() {
		return dental;
	}
	public void setFounderName(String name) {
		founderName=name;
	}
	public String getFounderName() {
		return founderName;
	}
	public void setTotalStaff(int staff) {
		totalStaff=staff;
	}
	public int getTotalStaff() {
		return totalStaff;
	}
}
