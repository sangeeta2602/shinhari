class Train{
    public static void main(String[] args) {
        float ticket=1000.1f;
        float speed=234.45f;
        float salayOfEmployee=2345787.23f;
        
        float [] details={ticket,speed,salayOfEmployee};
        details[0]=3000.4f;
		ticket=details[0];
        System.out.println(details.length);
       for(int i=0;i<2;i++)
       System.out.println(details[i]);   }
}
   