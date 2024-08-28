class ITCompany{
public static void ibm(String role,int salary){
	if((role=="data analyst" && salary==32000) && (role!="data analyst" || salary==32000)){
		System.out.println("if condition1");
	}else{
		System.out.println("else condition1");
	}
		if((role!="data analyst" || salary!=32000 ) && (role=="data analyst" && salary==32000))
		{
	
       System.out.println("if condition2");
	}else{
		System.out.println("else condition2");
	}
	if((role=="data analyst" && salary!=32000) || (role=="data analyst" || salary==32000)){
		System.out.println("if condition3");
	}else{
		System.out.println("else condition3");
	}
	if((role=="data analyst" && salary==32000)  || (role=="data analyst" && salary==32000)){
		System.out.println("if condition4");
	}else{
		System.out.println("else condition4");
	}
	
		
}
}
