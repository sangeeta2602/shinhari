package com.xworkz.webseries.boot;

public interface ProductionHouse {
	default void movie() {
		System.out.println("movie method");
	}
	 default void television() {
		 System.out.println("television method");
	 }
	 default void  website() {
		 System.out.println("website method");
	 }
	 default void comics() {
		 System.out.println("comics method");
	 }
    default void radio() {
    	System.out.println("radio method");
    }
    default void videoGames() {
    	System.out.println("videoGames method");
    }
    default void music() {
    	System.out.println("music method");
    }
    default void intractiveArt() {
    	System.out.println("intractiveArt method");
    }
    default void video() {
    	System.out.println("video method");
    }
    default void producer() {
    	System.out.println("producer method");
    }
    static void designers() {
    	System.out.println("designers method");
    }
    static void direction() {
    	System.out.println("direction method");
    }
    static void publisher() {
    	System.out.println("publisher method");
    }
    static void owner() {
    	System.out.println("owner method");
    }
     static void mediaOwnership() {
    	 System.out.println("mediaOwnership method");
    }
    static void studioSystem() {
    	System.out.println("studioSystem method");
    }
     static void script() {
    	 System.out.println("script method");
     }
      static void partner() {
    	  System.out.println("partner method");
      }
     static void investers() {
    	 System.out.println("investers method");
     }
     static void staff() {
    	 System.out.println("staff method");
      }

}
