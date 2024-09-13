class Auto{
      int meterPrice;
      String areaName;
      float autoLoanAmount;
      double monthlyIncome;
	  char blockName;
	  boolean isAutoTravellingGoodOrBad;
	  long dailyIncome;
	  
	  public Auto(int price,String name, float amount,double monthlyIncome,char block,boolean isAutoTravellingGoodOrBad ,long dailyIncome){
		 meterPrice=price;
		 areaName=name;
		 autoLoanAmount=amount;
		 this.monthlyIncome=monthlyIncome;
		 blockName=block;
		 this.isAutoTravellingGoodOrBad=isAutoTravellingGoodOrBad;
		 this.dailyIncome=dailyIncome;
	  }
	  
	  public int getAuto(){
		  return meterPrice;
	  }
	  public String getAuto1(){
		  return areaName;
	  }
	  public float getAuto2(){
		  return autoLoanAmount;
	  }
	  public double getAuto3(){
		  return monthlyIncome;
	  }
	  public char getAuto4(){
		  return blockName;
	  }
	  public boolean getAuto5(){
		  return isAutoTravellingGoodOrBad; 
	  }
	  public long getAuto6(){
		  return dailyIncome;
	  }
}