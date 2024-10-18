package task;

public class MarksDetails {
	
	public MarksDetails(int age,String password,String name,String email,int batch ) throws Exception {
	
		boolean value=email.contains("@gmail.com");
		boolean nam=name.contains("@_1234567890");
		
	if(age>18 && age<60) {
		throw new MarksException();
	}else {
		System.out.println("age is valid");
	}
	if(value){
		System.out.println("email is valid");
	}else {
		throw new MarksException();
	}
    if(password.length()>7){
	     throw new MarksException();
	}else {
		System.out.println("password is lengthis 7");
	}
    if(nam) {
    	throw new MarksException();
    }else {
    	System.out.println("name is correct");
    }
	
    if(name.length()>8){
	    System.out.println("name length is 8");
	}else {
		
			
			throw new MarksException();
	       
	}

		
	
	 
	}

}
