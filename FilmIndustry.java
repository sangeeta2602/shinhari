class FilmIndustry{
	
    static String movieName;
	static Double movieBudget;
	static Integer totalSongs;
	static Float movieTicketPrice;
	static Boolean isMovieGoodOrBad;
	
	
public static void setMovieName(String name){
	 movieName=name;
	 
}
public static void setMovieBudget(Double budget){
	movieBudget=budget;
}
public static void setTotalSongs(Integer totSongs){
	 totalSongs=totSongs;
}
public static void setMovieTicketPrice(Float ticketPrice){
	movieTicketPrice=ticketPrice;
}
public static void setIsMovieGoodOrBad(Boolean movieGoodOrBad){
	isMovieGoodOrBad=movieGoodOrBad;
}
public String getMovieName(){
	return movieName;

}
public Double getMovieBudget(){
	return movieBudget;
}
public Integer getTotalSongs(){
	return totalSongs;
}
public Float getMovieTicketPrice(){
	return movieTicketPrice;
}
public Boolean isMovieGoodOrBad(){
	return isMovieGoodOrBad;
}
}