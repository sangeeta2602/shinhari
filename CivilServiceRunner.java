class CivilServiceRunner{
public static void main(String [] args){
CivilService.setCsSalary(52000d);
double salary=CivilService.getCsSalary();
System.out.println(salary);
	
CivilService.setCsName("IAS");
String name=CivilService.getCsName();
System.out.println(name);

}}