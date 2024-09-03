class Watch{
	static String watchName;
	static float tax;
    static double watchCost;
    static boolean isGoodOrBad;
    static char warranty;
    static int warrantyYear;
	
	public static void setWatchName(String name){
		watchName=name;
	}
	public static void setTax(float tax){
		Watch.tax=tax;
	}
	public static void setWatchCost(double cost){
		watchCost=cost;
	}
	public static void setIsGoodOrBad(boolean isGoodOrBad){
	     Watch.isGoodOrBad=isGoodOrBad;
	}
	public static void setWarranty(char warranty){
		Watch.warranty=warranty;
	}
	public static void setWarrantyYear(int year){
		warrantyYear=year;
	}

	             public static String getWatchName(){
		    return watchName;
	}
		public static float getTax(){
		      return  tax;
		}
		public static double getWatchCost(){
		      return watchCost;
		}
		public static boolean isGoodOrBad(){
		       return isGoodOrBad;
		}
		public static char getWarranty(){
		         return warranty;
		}
		
		public static int getWarrantyYear(){
		        return  warrantyYear;
				}
	
}