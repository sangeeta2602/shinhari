package com.shinhari.xworkz.boot;

public class BatchRunner {

	public static void main(String [] args) {
		Batch_1 ref=new Batch_1();
		   ref.setStrength(5);
		   System.out.println(ref.getStrength());
		   ref.setBatchName("G005ROE");
		   System.out.println(ref.getBatchName());
		   Batch_2 detail=new Batch_2();
		    detail.setBatchName("G003ROE");
		    System.out.println(detail.getBatchName());
		    detail.setTiming(10.0f);
		    System.out.println(detail.getTiming());
	}
}
