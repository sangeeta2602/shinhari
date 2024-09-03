class WatchRunner{
	public static void main(String [] args){
		
	Watch.setWatchName("fastrack");
	String name=Watch.getWatchName();
	System.out.println(name);
	
		Watch.setTax(2345.2f);
		float tax=Watch.getTax();
			System.out.println(tax);
		
		Watch.setWatchCost(25000.99d);
		double cost=Watch.getWatchCost();
			System.out.println(cost);
	
		Watch.setIsGoodOrBad(true);
		 boolean condition=Watch.isGoodOrBad();
		 System.out.println(condition);
		 
		Watch.setWarranty('s');
		char warranty=Watch.getWarranty();
		System.out.println(warranty);
		
		Watch.setWarrantyYear(2);
		  int year=Watch.getWarrantyYear();
      System.out.println(year);
	}
}
		
	   
		
	
	  
		
		
	
		
		
		
		
		
		
	