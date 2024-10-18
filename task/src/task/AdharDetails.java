package task;

public class AdharDetails {
	
	public AdharDetails(int age,String password,String name,String phoneNum,String email,int batch) throws Exception
		{
		
		if(age>18 && age<50) {
			System.out.println("u are eligible");
		}else {
			throw new AdharException();
		}
		if(name.length()>8 ) {
			System.out.println("name is correct=");
		}else {
			throw new AdharException();
		}
		
		if(password.length()>7){
	     System.out.println("password is correct ");
	       }
		else  {
			throw new AdharException();
		}
	  
		 
		if (phoneNum.length()>10) {
			System.out.println("phonenumber has 10 digits");
	    }
		else {
            throw new AdharException();
		}
		
		boolean num=phoneNum.startsWith("9"); 
		if(num){
			System.out.println("phnNum starts with 9");
		}else {
			throw new AdharException();
		}
		
	boolean value=email.contains("@gmail.com");
		 if(value){
			throw new AdharException();
		}else {
			System.out.println("email is correct");
		}

	
}
}

