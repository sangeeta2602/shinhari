class JavaRunner{
public static void main(String [] args){
    
	Java details = new Java();
	details.wert(234567,"jnv shool");
int version =	details.totalVersions(22);
String name =	details.jobName("sde");
double salary = details.salary(300000.00d);
boolean condition =	details.javasecureOrNot(true);
long number =	details.contactNum(4500000l);

	System.out.println(version);
	System.out.println(name);
	System.out.println(salary);
	System.out.println(condition);
	System.out.println(number);

	
	}
	}