package com.shinhari.market.boot;

public class Market {
	public int tomatoRate;
	public String marketName;
	public boolean nearOrFar;
	
	public int getTomatoRate() {
		return tomatoRate;
	}
	public void setTomatoRate(int tomatoRate) {
		this.tomatoRate = tomatoRate;
	}
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public boolean isNearOrFar() {
		return nearOrFar;
	}
	public void setNearOrFar(boolean nearOrFar) {
		this.nearOrFar = nearOrFar;
	}
	public Market(int tomatoRate, String marketName, boolean nearOrFar) {
		super();
		this.tomatoRate = tomatoRate;
		this.marketName = marketName;
		this.nearOrFar = nearOrFar;
	}
	
	

}
