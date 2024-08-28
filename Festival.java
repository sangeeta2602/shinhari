class Festival{
public static void festival(String name,String day){
if((name=="dasara" &&  day=="monday") || (name!="dasara" &&  day=="monday"))
{
	System.out.println("if condition1");
}
else
{
	System.out.println("else condition1");
}
if((name!="dasara" || day=="monday") && (name=="dasara" && day=="monday"))
	{
	System.out.println("if condition2");
}else
{
	System.out.println("else condition2");
}
if((name!="dasara" || day=="monday") || (name=="dasara" && day=="monday"))
	{
	System.out.println("if condition3");
}
else
{
	System.out.println("else condition3");
}
if((name=="dasara" &&  day=="monday") && (name!="dasara" &&  day=="monday"))
{
	System.out.println("if condition4");
}
else
{
	System.out.println("else condition4");
}
}}