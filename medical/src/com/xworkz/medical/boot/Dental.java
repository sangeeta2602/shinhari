package com.xworkz.medical.boot;

public class Dental {
	public int totalPatients;
	public String doctorName;
	
	public int getTotalPatients() {
		return totalPatients;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setTotalPatients(int totalPatients) {
		this.totalPatients = totalPatients;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Dental(int totalPatients, String doctorName) {
	
		this.totalPatients = totalPatients;
		this.doctorName = doctorName;
	}

	

}
