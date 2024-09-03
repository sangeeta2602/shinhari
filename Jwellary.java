class Jwellary{
	static String shopName;
	static float gst;
    static double goldGram;
    static boolean isNearOrFar;
    static char offer;
    static long price;
    static int shopNum;
	
	public static void setShopName(String name){
		shopName=name;
	}
	public static void setGst(float gst){
		Jwellary.gst=gst;
	}
	public static void setGoldGram(double gram){
		goldGram=gram;
	}
	public static void setIsNearOrFar(boolean isNearOrFar){
	Jwellary.isNearOrFar=isNearOrFar;
	}
	public static void setOffer(char offer){
		Jwellary.offer=offer;
	}
	public static void setPrice(byte price){
		Jwellary.price=price;
	}
	public static void setShopNum(int number){
		shopNum=number;
	}

	             public static String getShopName(){
		    return shopName;
	}
		public static float getGst(){
		      return  gst;
		}
		public static double getGoldGram(){
		      return goldGram;
		}
		public static boolean isNearOrFar(){
		       return isNearOrFar;
		}
		public static char getOffer(){
		         return offer;
		}
		public static long getPrice(){
		        return price;
		}
		public static int getShopNum(){
		        return  shopNum;
				}
	
}