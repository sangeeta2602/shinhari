class DairyProducts{
public static void milk(String name,int price){
if((name=="nandini" &&  price==25) || (name!="nandini" &&  price==25))
{
	System.out.println("if condition1");
}
else
{
	System.out.println("else condition1");
}
if((name!="nandini" && price==25) && (name=="nandini" && price==25))
	{
	System.out.println("if condition2");
}else
{
	System.out.println("else condition2");
}
if((name!="nandini" && price==25) || (name=="nandini" && price==25))
	{
	System.out.println("if condition3");
}
else
{
	System.out.println("else condition3");
}
if((name=="nandini" &&  price==25) && (name!="nandini" &&  price==25))
{
	System.out.println("if condition4");
}
else
{
	System.out.println("else condition4");
}
}}