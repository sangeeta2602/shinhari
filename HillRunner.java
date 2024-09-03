class HillRunner{
public static void main(String [] args)
{
Hill.setHill(23.23f);
float height=Hill.getHill();
System.out.println(height);
Hill.setHillName("nilgiri hills");
String name=Hill.getHillName();
System.out.println(name);
}

}