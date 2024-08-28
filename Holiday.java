class Holiday{
public static void govtHoliday(String month,String name){
if((month=="october" &&  name=="children day") || (month!="october" &&  name=="children day"))
{
	System.out.println("if condition1");
}
else
{
	System.out.println("else condition1");
}
if((month!="october" && name=="children day") && (month=="october" && name=="children day"))
	{
	System.out.println("if condition2");
}else
{
	System.out.println("else condition2");
}
if((month!="october" && name=="children day") || (month=="october" && name=="children day "))
	{
	System.out.println("if condition3");
}
else
{
	System.out.println("else condition3");
}
if((month=="october" &&  name=="children day") && (month!="october" &&  name=="children day"))
{
	System.out.println("if condition4");
}
else
{
	System.out.println("else condition4");
}
}}
