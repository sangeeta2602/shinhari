package com.xworkz.shopping.boot;

public interface OnlineShopping {
	
	default void brands() {
		System.out.println("brands method");
	}
	 default void acessocries() {
		 System.out.println("acessocries method");
	 }
	 default void offer() {
		 System.out.println("offer method");
	 }
	 default void cupons() {
		 System.out.println("cupons method");
	 }
    default void refund() {
    	System.out.println("refund method");
    }
    default void modeOfPayment() {
    	System.out.println("modeOfPayment method");
    }
    default void platformForShopping() {
    	System.out.println("platformForShopping method");
    }
    default void clothes() {
    	System.out.println("clothes method");
    }
    default void medicenes() {
    	System.out.println("medicenes method");
    }
    default void groceries() {
    	System.out.println("groceries method");
    }
    static void replacement() {
    	System.out.println("replacement method");
    }
    static void owner() {
    	System.out.println("owner method");
    }
    static void brandAmbazider() {
    	System.out.println("brandAmbazider method");
    }
    static void advertisement() {
    	System.out.println("advertisement method");
    }
     static void gagets() {
    	 System.out.println("gagets method");
    }
    static void travelAccessceries() {
    	System.out.println("travelAccessceries method");
    }
     static void travelTickets() {
    	 System.out.println("travelTickets method");
     }
      static void customerDetails() {
    	  System.out.println("customerDetails method");
      }
     static void price() {
    	 System.out.println("price method");
     }
     static void quality() {
    	 System.out.println("quality method");
      }

}
