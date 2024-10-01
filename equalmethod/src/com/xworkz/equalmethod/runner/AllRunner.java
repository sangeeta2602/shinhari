package com.xworkz.equalmethod.runner;

import com.xworkz.equalmethod.boot.Book;
import com.xworkz.equalmethod.boot.Car;
import com.xworkz.equalmethod.boot.Gold;
import com.xworkz.equalmethod.boot.Phone;
import com.xworkz.equalmethod.boot.College;
import com.xworkz.equalmethod.boot.Vegetable;
import com.xworkz.equalmethod.boot.Temple;
import com.xworkz.equalmethod.boot.Parlour;
import com.xworkz.equalmethod.boot.School;
import com.xworkz.equalmethod.boot.Laptop;

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
		   
		   Vegetable veg=new Vegetable(40,"k r market",30,true,"hanumanta",15,10,2000,"chikpete",true);
		   System.out.println(veg.equals(veg));
		   
		   Temple temple=new Temple(200,"yeshwanthpur","krishna",true,32000,3000,10,20,"manjunath",true);
		   System.out.println(temple.equals(temple));
		   
		   School school=new School("Don Boosco",32000,"rajajinagar",true,"likitha",50,true,"8th","kusuma ",35);
		   System.out.println(school.equals(school));
		   
		   Parlour parlour=new Parlour("shubha parlour",800,"shubha",true,"lotus",8,38,32000,"mathikere",true);
		   System.out.println(parlour.equals(parlour));
		   
		   Laptop laptop=new Laptop(" hp",32000,"intel i7",true,"8 gb",8,32,"ventatesh ",true,"black");
		   System.out.println(laptop.equals(laptop));

		   
	   }

}
