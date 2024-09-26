package com.xworkz.director.runner;

import com.xworkz.director.boot.Producer1;

public class ProducerRunner {
	public static void main(String [] args) {
	
		Producer1 producer=new Producer1();
		producer.producer();
		producer.producer("ega");
		producer.producer("ega",75);
		producer.producer("ega",75,20000000.0f,'a');
		producer.producer("ega",75,20000000.0f,'a',6456789965l);
		producer.producer("ega",75,20000000.0f,'a',6456789965l,true);
		producer.producer("ega",75,20000000.0f,'a',6456789965l,true,100000000.0d);
	}

}
