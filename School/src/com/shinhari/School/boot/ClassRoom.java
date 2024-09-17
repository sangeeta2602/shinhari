package com.shinhari.School.boot;

public class ClassRoom {
	public int clsStrength;
	public String schoolName;
	public School school;
	
	public int getClsStrength() {
		return clsStrength;
	}
	public void setClsStrength(int clsStrength) {
		this.clsStrength = clsStrength;
	}
	public String getClsRoomName() {
		return schoolName;
	}
	public void setClsRoomName(String schoolName) {
		this.schoolName = schoolName;
	}
	public  School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public ClassRoom(int clsStrength, String schoolName, School school) {
		
		this.clsStrength = clsStrength;
		this.schoolName = schoolName;
		this.school = school;
	}
}
	