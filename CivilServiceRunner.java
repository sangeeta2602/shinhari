class MirrorRunner{
public static void main(String [] args){
CivilService.setCsSalary(52000d);
double salary=getCsSalary();
System.out.println(salary);

CivilService.setCsName("IAS");
String name=getCsName();
System.out.println(name);

}
}