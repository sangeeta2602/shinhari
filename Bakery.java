class Bakery{
    public static void main(String[] args) {
        double rent=2000.34567d;
        double montlyIncome=50000.2345d;
        double itemsInBakery=3561478.345d;
        double investment=3465786.2345d;
        double [] details={rent,montlyIncome,itemsInBakery,investment};
        details[2]=3456.23456d;
		itemsInBakery=details[2];
        System.out.println(details.length);
       for(int i=0;i<3;i++)
       System.out.println(details[i]);   }
}