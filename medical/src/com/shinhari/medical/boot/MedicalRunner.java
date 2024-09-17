package com.shinhari.medical.boot;

import com.shinhari.medical.boot.Medical;
import com.shinhari.medical.boot.Clinic;

public class MedicalRunner {
    public static void main(String [] args) {
    	
    	Medical ref=new Medical();
    	Clinic details= new Clinic();
    	
    	ref.setNoStaff(50);
    	System.out.println(ref.getNoStaff());
    	ref.setNameOfHospital("smiles hospital");
    	System.out.println(ref.getNameOfHospital());
    	ref.setEntryFees(300);
    	System.out.println(ref.getEntryFees());
    	details.setNoOfMedicines(1000000.d);
    	System.out.println(details.getNoOfMedicines());
    	details.setItPrivateOrGovt(false);
          System.out.println(details.isItPrivateOrGovt());    	
    	
    	
    }
}
