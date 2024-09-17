package com.shinhari.medical.boot;

public class Clinic {
      double NoOfMedicines;
      boolean isItPrivateOrGovt;
	public double getNoOfMedicines() {
		return NoOfMedicines;
	}
	public void setNoOfMedicines(double noOfMedicines) {
		NoOfMedicines = noOfMedicines;
	}
	public boolean isItPrivateOrGovt() {
		return isItPrivateOrGovt;
	}
	public void setItPrivateOrGovt(boolean isItPrivateOrGovt) {
		this.isItPrivateOrGovt = isItPrivateOrGovt;
	}
      
}
