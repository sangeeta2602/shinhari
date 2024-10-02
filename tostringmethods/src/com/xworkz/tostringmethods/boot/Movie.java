package com.xworkz.tostringmethods.boot;

public class Movie {
	public static void main(String [] aegs) {
		String nameOfMovie="three";           
		char value=nameOfMovie.charAt(0);
     System.out.println(value);
     
     boolean yRn=nameOfMovie.equals(nameOfMovie);     
     System.out.println(yRn);                     
     
     int code=nameOfMovie.hashCode();
     System.out.println(code);
     
     String string=nameOfMovie.concat("is a good movie");
     System.out.println(string);
     
     String moviee="KEMPEGOWDA";
     String str=moviee.toLowerCase();
     System.out.println(str);
     
     String upper=nameOfMovie.toUpperCase();
     System.out.println(upper);
     
     boolean contain=nameOfMovie.contains("ree");
     System.out.println(contain);
     
    boolean charvalue=nameOfMovie.endsWith(nameOfMovie);
    System.out.println(charvalue);
    
    byte[] bytevalue=nameOfMovie.getBytes();
    System.out.println(bytevalue.length);
    
    boolean tRf=nameOfMovie.isEmpty();
    System.out.println(tRf);
    
    int lengthValue=nameOfMovie.length();
    System.out.println(lengthValue);
    
    boolean trueRFalse=nameOfMovie.matches(moviee);
    System.out.println(trueRFalse);
    
 
	}

}
