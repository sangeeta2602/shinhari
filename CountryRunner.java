class CountryRunner{
	
	public static void main(String [] args){
		Country details = new Country();
		details.setCountryName("INDIA");
		details.getCountryName();
		System.out.println(details.getCountryName());
		
		details.setPeopleStrength(1500000000.0D);
		details.getPeopleStrength();
		System.out.println(details.getPeopleStrength());
		
		details.setNoDistict(31);
		details.getNoDistict();
		System.out.println(details.getNoDistict());
		
	details.getTotalStates();	
	details.setTotalStates(28.0F);
		System.out.println(details.getTotalStates());
		
		details.setIsBeautifulOrNot(true);
		details.isBeautifulOrNot();
		
		System.out.println(details.isBeautifulOrNot());
		
	}
}