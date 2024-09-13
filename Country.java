class Country{
	
     String countryName;
	 Double peopleStrength;
	 Integer noDistict;
	 Float totalStates;
	 Boolean isBeautifulOrNot;
	
	
public  void setCountryName(String name){
	countryName =name;
	 
}
public  void setPeopleStrength(Double strength){
	peopleStrength=strength;
}
public  void setNoDistict(Integer distick){
	 noDistict=distick;
}
public  void setTotalStates(Float states){
	totalStates=states;
}
public  void setIsBeautifulOrNot(Boolean condition){
	isBeautifulOrNot=condition;
}
public String getCountryName(){
	return countryName;

}
public Double getPeopleStrength(){
	return peopleStrength;
}
public Integer getNoDistict(){
	return noDistict;
}
public Float getTotalStates(){
	return totalStates;
}
public Boolean isBeautifulOrNot(){
	return isBeautifulOrNot;
}
}