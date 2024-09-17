package com.shinhari.School.runner;

import com.shinhari.School.boot.ClassRoom;
import com.shinhari.School.boot.School;

public class SchoolRunner {
	public static void main(String [] args) {
		School school=new School(500.0f,20000.d,true);
		ClassRoom  classroom=new ClassRoom(45,"jnv school",school);
		System.out.println("classroom details==="+classroom.getSchool().getFees());
		
		
		
		
		
		
	}

}
