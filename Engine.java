class Engine{
	

  public static void engine(int types,String engineName){
	  if(types==2 && engineName=="Disel engine"){
		  System.out.println("if condition1=" +types+ "if condition1=="+engineName);
	  }else
	  {
		   System.out.println("else condition1=" +types+ "else condition1=="+engineName);
	  }
	  if(types==3 && engineName=="Disel engine"){
		  System.out.println("if condition2=" +types+ "if condition2=="+engineName);
	  }else
	  {
		   System.out.println("else condition2=" +types+ "else condition2=="+engineName);
	  }
	  if(types==2 && engineName=="disel"){
		  System.out.println("if condition3=" +types+ "if condition3=="+engineName);
	  }else
	  {
		   System.out.println("else condition3=" +types+ "else condition3=="+engineName);
	  }
	  if(types==1 && engineName=="disel"){
		  System.out.println("if condition4=" +types+ "if condition4=="+engineName);
	  }else
	  {
		   System.out.println("else condition4=" +types+ "else condition4=="+engineName);
	  }if(types==2 || engineName=="Disel engine"){
		  System.out.println("if condition5=" +types+ "if condition5=="+engineName);
	  }else
	  {
		   System.out.println("else condition5=" +types+ "else condition5=="+engineName);
	  }
	  if(types==5 || engineName=="Disel engine"){
		  System.out.println("if condition6=" +types+ "if condition6=="+engineName);
	  }else
	  {
		   System.out.println("else condition6=" +types+ "else condition6=="+engineName);
	  }
	  if(types==2 || engineName=="disel"){
		  System.out.println("if condition7=" +types+ "if condition7=="+engineName);
	  }else
	  {
		   System.out.println("else condition7=" +types+ "else condition7=="+engineName);
	  }
	  if(types==1 || engineName=="disel"){
		  System.out.println("if condition8=" +types+ "if condition8=="+engineName);
	  }else
	  {
		   System.out.println("else condition8=" +types+ "else condition8=="+engineName);
	  }
  }
}