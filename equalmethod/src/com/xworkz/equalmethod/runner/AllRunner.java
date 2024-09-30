package com.xworkz.equalmethod.runner;

import com.xworkz.equalmethod.boot.Book;
import com.xworkz.equalmethod.boot.Car;
import com.xworkz.equalmethod.boot.Gold;
import com.xworkz.equalmethod.boot.Phone;
import com.xworkz.equalmethod.boot.College;
public class AllRunner {

	public static void main(String [] args) {
		   Book book=new Book("notebook",30,4,true,25,"moral story book",72,50,25,true);
		   System.out.println(book.equals(book));
		   
		   Car car=new Car(1000000.0f,"white","civic",true,"honda",false,16,6,true,true);
		   System.out.println(car.equals(car));
		   
		   Phone phone=new Phone("samsung",25000,24,true,16,22000,true,5,true,64);
		   System.out.println(phone.equals(phone));
		   
		   Gold gold=new Gold("kalyan jwellaers",25,0.02f,"hatti",25000,5,8,4,true,true);
		   System.out.println(gold.equals(gold));
		   
		  College clg=new College(105000.0d,"Reva University","CSSE",true,"dr.shyam raju",3,150,5000,"Dr.Mallikarjun",true);
		   System.out.println(clg.equals(clg));
		   
	   }

}
