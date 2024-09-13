class Furniture{
      int tableprice;
      String furnitureName;
      float advcAmount;
      double onlinePrice;
	  char size;
	  boolean isItRecycledOrNot;
	  long contactNum;
	  
	  public Furniture(int price,String furnitureName, float advcAmount,double onlinePrice,char size,boolean isItRecycledOrNot,long contactNum){
		 tableprice=price;
		 this.furnitureName=furnitureName;
		 this.advcAmount=advcAmount;
		 this.onlinePrice=onlinePrice;
		 this.size=size;
		 this.isItRecycledOrNot=isItRecycledOrNot;
		 this.contactNum=contactNum;
	  }
	  
	  public int getFurniture(){
		  return tableprice;
	  }
	  public String getFurniture1(){
		  return furnitureName;
	  }
	  public float getFurniture2(){
		  return advcAmount;
	  }
	  public double getFurniture3(){
		  return onlinePrice;
	  }
	  public char getFurniture4(){
		  return size;
	  }
	  public boolean getFurniture5(){
		  return isItRecycledOrNot; 
	  }
	  public long getFurniture6(){
		  return contactNum;
	  }
}