class JwellaryRunner{
	public static void main(String [] args){
		Jwellary.setShopName("BHIMA");
		Jwellary.setGst(2345.2f);
		Jwellary.setGoldGram(53.99d);
		Jwellary.setIsNearOrFar(true);
		Jwellary.setOffer('s');
		Jwellary.setPrice(90000l);
		Jwellary.setShopNum(15);
	String name=Jwellary.getShopName();
		float gst=Jwellary.getGst();
		double gram=Jwellary.getGoldGram();
	    boolean nearOrFar=Jwellary.isNearOrFar();
		char offer=Jwellary.getOffer();
	  long  price=Jwellary.getPrice();
		int shopNum=Jwellary.getShopNum();
		System.out.println(name);
		System.out.println(gst);
	System.out.println(gram);
		System.out.println(nearOrFar);
		System.out.println(offer);
		System.out.println(price);
		System.out.println(shopNum);
		
		
		
	}
}