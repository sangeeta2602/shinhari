class Place{
	public static void main(String [] args)
	{
		String placeName="nandi hills";
		String snacks="corn";
		String state="karnataka";
		String vehicle="car";
		
		String [] places={placeName,snacks,state,vehicle};
		places[3]="bus";
		vehicle=places[3];
		  System.out.println(places.length);
       for(int i=0;i<4;i++){
       System.out.println(places[i]);
	   }
	}
}