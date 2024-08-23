class Govt{
	

  public static void jobs(int vacancy,String jobName){
	  if(vacancy==25 && jobName=="junior engg"){
		  System.out.println("if condition1=" +vacancy+ "if condition1=="+jobName);
	  }else
	  {
		   System.out.println("else condition1=" +vacancy+ "else condition1=="+jobName);
	  }
	  if(vacancy==20 && jobName=="junior engg"){
		  System.out.println("if condition2=" +vacancy+ "if condition2=="+jobName);
	  }else
	  {
		   System.out.println("else condition2= " +vacancy+ "else condition2=="+jobName);
	  }
	  if(vacancy==25 && jobName=="engg"){
		  System.out.println("if condition3= " +vacancy+ "if condition3=="+jobName);
	  }else
	  {
		   System.out.println("else condition3= " +vacancy+ "else condition3=="+jobName);
	  }
	  if(vacancy==15 && jobName=="engg"){
		  System.out.println("if condition4= " +vacancy+ "if condition4=="+jobName);
	  }else
	  {
		   System.out.println("else condition4= " +vacancy+ "else condition4=="+jobName);
	  }if(vacancy==25 || jobName=="junior engg"){
		  System.out.println("if condition5= " +vacancy+ "if condition5=="+jobName);
	  }else
	  {
		   System.out.println("else condition5= " +vacancy+ "else condition5=="+jobName);
	  }
	  if(vacancy==15 || jobName=="junior engg"){
		  System.out.println("if condition6= " +vacancy+ "if condition6=="+jobName);
	  }else
	  {
		   System.out.println("else condition6= " +vacancy+ "else condition6=="+jobName);
	  }
	  if(vacancy==25 || jobName=="engg"){
		  System.out.println("if condition7= " +vacancy+ "if condition7=="+jobName);
	  }else
	  {
		   System.out.println("else condition7= " +vacancy+ "else condition7=="+jobName);
	  }
	  if(vacancy==15 || jobName=="engg"){
		  System.out.println("if condition8=" +vacancy+ "if condition8=="+jobName);
	  }else
	  {
		   System.out.println("else condition8=" +vacancy+ "else condition8=="+jobName);
	  }
  }
}