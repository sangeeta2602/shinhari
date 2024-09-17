package com.xworkz.medical.runner;

import com.xworkz.medical.boot.Dental;
import com.xworkz.medical.boot.Cardiology;

public class MultiSpecialty {
	public String hospName;
	public Dental dental;
	public static void main(String [] args) {
		
		Dental dental=new Dental(15,"ganesh");
		System.out.println(dental.getDoctorName());
		
		
		
		Cardiology info=new Cardiology("dr.karthik",100,dental);
		System.out.println(info.getDental().getTotalPatients());
	
	}
	
}