class FilmIndustryRunner{
	
	public static void main(String [] args){
		FilmIndustry details = new FilmIndustry();
		details.setMovieName("maharaja");
		details.getMovieName();
		System.out.println(details.getMovieName());
		details.setMovieBudget(1500000.0D);
		details.getMovieBudget();
		System.out.println(details.getMovieBudget());
		details.setTotalSongs(5);
		details.getTotalSongs();
		System.out.println(details.getTotalSongs());
		details.setMovieTicketPrice(250.0F);
			details.getMovieTicketPrice();
		System.out.println(details.getMovieTicketPrice());
		details.setIsMovieGoodOrBad(true);
		details.isMovieGoodOrBad();
		
		System.out.println(details.isMovieGoodOrBad());
		
	}
}