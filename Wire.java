class Wire{
      int core;
      String wireName;
      float wireMeter;
      double onlinePrice;
	  char color;
	  boolean isGoodConductorOrNot;
	  long price;
	  
	  public Wire(int core,String name, float meter,double onlinePrice,char color,boolean isGoodConductorOrNot ,long price){
		 this.core=core;
		 wireName=name;
		 wireMeter=meter;
		 this.onlinePrice=onlinePrice;
		 this.color=color;
		 this.isGoodConductorOrNot=isGoodConductorOrNot;
		 this.price=price;
	  }
	  
	  public int getWire(){
		  return core;
	  }
	  public String getWire1(){
		  return wireName;
	  }
	  public float getWire2(){
		  return wireMeter;
	  }
	  public double getWire3(){
		  return onlinePrice;
	  }
	  public char getWire4(){
		  return color;
	  }
	  public boolean getWire5(){
		  return isGoodConductorOrNot; 
	  }
	  public long getWire6(){
		  return price;
	  }
}