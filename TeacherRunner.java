class TeacherRunner{
public static void main(String [] args){
    
	Teacher details = new Teacher();
	details.wert(234567,"jnv shool");
	
int salay =	details.salay(2345);
String school =	details.school("saraswati");
double donation = details.schoolDonation(450000.00d);

boolean condition =	details.isNearOrFar(true);
long fees =	details.schoolFees(4500000);
char section =	details.classSection('a');
    
	System.out.println(salay);
	System.out.println(school);
	System.out.println(donation);

	System.out.println(condition);
	System.out.println(fees);
	System.out.println(section);
	}
	}