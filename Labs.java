class Labs{
      int totalPc;
      String subName;
      float clsStrength;
      double totalStaff;
	  char section;
	  boolean isClassOpenedOrNot;
	  
	  
	  public Labs(int pc,String name, float strength,double staff,char section,boolean isClassOpenedOrNot){
		 totalPc=pc;
		 subName=name;
		 clsStrength=strength;
		 totalStaff=staff;
		 this.section=section;
		 this.isClassOpenedOrNot=isClassOpenedOrNot;
		
	  }
	  
	  public int getLab(){
		  return totalPc;
	  }
	  public String getLab1(){
		  return subName;
	  }
	  public float getLab2(){
		  return clsStrength;
	  }
	  public double getLab3(){
		  return totalStaff;
	  }
	  public char getLab4(){
		  return section;
	  }
	  public boolean getLab5(){
		  return isClassOpenedOrNot; 
	  }
	 
}