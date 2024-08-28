class Internship{
public static void summerInternship(String role,int totalmonth){
if((role=="dasara" &&  totalmonth==3) || (role!="dasara" &&  totalmonth!=3))
{
	System.out.println("if condition1");
}
else
{
	System.out.println("else condition1");
}
if((role!="dasara" || totalmonth!=3) && (role=="dasara" && totalmonth==3))
	{
	System.out.println("if condition2");
}else
{
	System.out.println("else condition2");
}
if((role!="dasara" || totalmonth==3) || (role=="dasara" && totalmonth==3))
	{
	System.out.println("if condition3");
}
else
{
	System.out.println("else condition3");
}
if((role=="dasara" &&  totalmonth==3) && (role!="dasara" &&  totalmonth==3))
{
	System.out.println("if condition4");
}
else
{
	System.out.println("else condition4");
}
}}