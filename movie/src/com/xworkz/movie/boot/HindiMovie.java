package com.xworkz.movie.boot;

public class HindiMovie {
	public String movieName;
	public double budget;
	public String heroName;
	
	public HindiMovie() {
		
	}
	public HindiMovie(String movieName, double budget, String heroName) {
		this.movieName = movieName;
		this.budget = budget;
		this.heroName = heroName;
	}
	public String getMovieName() {
		return movieName;
	}
	public double getBudget() {
		return budget;
	}
	public String getHeroName() {
		return heroName;
	}
	
	

}
