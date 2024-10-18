package exception;

public class HeightRunnerException {
	public static void main(String [] args) throws Exception{
		
		HeightValueException heightValueException=new HeightValueException();
		heightValueException.value(6);
	}

}
