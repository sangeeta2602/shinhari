package task;

public class DLDetails {
	
	public  DLDetails(int age,String password,String name,String phnNum,String email,int batch ) throws Exception{
		
	
		   boolean value=email.contains("@gmail.com");
		   boolean nam=name.contains("@_1234567890");
		   
		   
		if(age>18 && age<60) {
			throw new DLException();
		}else {
			System.out.println("age is valid");
		}
	
		if(password.length()>7){
			System.out.println("password is lengthis 7");
		}else {
			throw new DLException();
		}

		
		if(nam){
			System.out.println("name contain number & Sc");
		}else {
			throw new DLException();
		}
		 if(name.length()>8){
		    System.out.println("name length is 8");
		}
		
		
		else {
		
			throw new DLException();
	
	
	}

}
}
