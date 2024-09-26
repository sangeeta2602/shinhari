package com.xworkz.makeup.runner;

import com.xworkz.makeup.root.Mamaearth;
public class Cosmetics {
     public static void main(String [] args) {
		
    	 Mamaearth mamaearth=new Mamaearth();
    	 mamaearth.lipstic("lakme");
    	 mamaearth.eyelinear("lakme",25);
    	 mamaearth.foundation("lakme",25,1000.f);
    	 mamaearth.moisturizer("lakme",25,1000.f,50.d);
    	 mamaearth.serum("lakme",25,1000.f,50.d,576l);
    	 mamaearth.compact("lakme",25,1000.f,50.d,576l,true);
	}
}
