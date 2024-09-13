class NailPolish{
      int npprice;
      String brandName;
      float quantity;
      double onlinePrice;
	  char color;
	  boolean isItRecycledOrNot;
	  long brandNum;
	  
	  public NailPolish(int price,String brandName, float quantity,double onlinePrice,char color,boolean isItRecycledOrNot,long brandNum)
	  {
		npprice =price;
		 this.brandName=brandName;
		 this.quantity=quantity;
		 this.onlinePrice=onlinePrice;
		 this.color=color;
		 this.isItRecycledOrNot=isItRecycledOrNot;
		 this.brandNum=brandNum;
	  }
	  
	  public int getNpprice(){
		  return npprice;
	  }
	  public String getBrandName(){
		  return brandName;
	  }
	  public float getQuantity(){
		  return quantity;
	  }
	  public double getOnlinePrice(){
		  return onlinePrice;
	  }
	  public char getColor(){
		  return color;
	  }
	  public boolean getIsItRecycledOrNot(){
		  return isItRecycledOrNot; 
	  }
	  public long getBrandNum(){
		  return brandNum;
	  }
}