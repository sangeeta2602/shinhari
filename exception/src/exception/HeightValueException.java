package exception;

public class HeightValueException {
	
	public void value(int height) throws Exception		 {
		if(height>5) {
			throw new HeightException();
		}else {
			System.out.println("this is to much");
		}
	}

}
