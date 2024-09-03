class Ref{
	static String refName;
	static float refWeight;
    static double cost;
    static boolean isRefIsGood;
    static char month;
    static long phNum;
    static int height;
//setter	
	public static void setRefName(String name){
		refName=name;
	}
	public static void seRefWeight(float weight){
		refWeight=weight;
	}
	public static void setCost(double cost){
		Ref.cost=cost;
	}
	public static void setIsRefIsGood(boolean isRefIsGood){
		Ref.isRefIsGood=isRefIsGood;
	}
	public static void setMonth(char month){
		Ref.month=month;
	}
	public static void setPhNum(long num){
		phNum=num;
	}
	public static void setHeight(int height){
		Ref.height=height;
	}
	// getter
	             public static String getRefName(){
		    return refName;
	}
		public static float getRefWeight(){
		      return  refWeight;
		}
		public static double getCost(){
		      return cost;
		}
		public static boolean isRefIsGood(){
		       return isRefIsGood;
		}
		public static char getMonth(){
		         return month;
		}
		public static long getPhNum(){
		        return phNum;
		}
		public static int getHeight(){
		        return  height;
				}
	
}