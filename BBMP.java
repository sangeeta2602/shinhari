class BBMP
{
         int workers;
         String inchargeName;
         double donation;
         long amountForConsruction;
         boolean fastOrSlow;
         float treePlanting;
         char direction;
		
		 
		 
		 
           public static void wert(int amount,String name){
	
             }
                   public int workers(int count)
				   {
					   workers=count;
                      	return workers;
                   }
				  public String inchargeName(String name )
				  {
					   inchargeName=name;
	                   return inchargeName;
                  }
                  public double constructionDonation(double donation1)
				  {
					   donation=donation1;
	                   return donation;
                   }
                 
				   public boolean condition(boolean timing)
				   {
					     fastOrSlow=timing;
                    	return fastOrSlow;            
                   }
				   
                  public float noPlants(float planting)
				  {
					  treePlanting=planting;
	                    return treePlanting;
                  }
                   public long constructionAmount(long amount)
				   {
					   amountForConsruction=amount;
                      	return amountForConsruction;
                   }
                   public char building(char buildingDirection)
				   {
					   direction=buildingDirection;
	                      return direction;
                    }
}