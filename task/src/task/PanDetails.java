package task;

public class PanDetails {
	
	public PanDetails(int age) throws Exception{
	
	if(age>19 && age<60) {
		System.out.println("age is correct");
	}else {
		throw new PanException();
	}
	
	}
}

