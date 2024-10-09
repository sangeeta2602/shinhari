package com.xworkz.hotel.boot;

public interface Hotel {
	
	default void dish() {
		System.out.println("dish method");
	}
	 default void accounting() {
		 System.out.println("accounting method");
	 }
	 default void manager() {
		 System.out.println("manager method");
	 }
	 default void electricity() {
		 System.out.println("electricity method");
	 }
    default void garden() {
    	System.out.println("garden method");
    }
    default void rooms() {
    	System.out.println("rooms method");
    }
    default void workers() {
    	System.out.println("workers method");
    }
    default void guestRoom() {
    	System.out.println("guestRoom method");
    }
    default void floor() {
    	System.out.println("floor method");
    }
    default void owner() {
    	System.out.println("owner method");
    }
    static void designation() {
    	System.out.println("designation method");
    }
    static void shef() {
    	System.out.println("shef method");
    }
    static void houseKeeping() {
    	System.out.println("houseKeeping method");
    }
    static void salary() {
    	System.out.println("salary method");
    }
     static void swimming() {
    	 System.out.println("swimming method");
    }
    static void games() {
    	System.out.println("games method");
    }
     static void spa() {
    	 System.out.println("spa method");
     }
      static void gym() {
    	  System.out.println("gym method");
      }
     static void clinic() {
    	 System.out.println("clinic method");
     }
     static void offers() {
    	 System.out.println("offers method");
      }

    
}
