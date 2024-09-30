package com.xworkx.wedding.boot;

public class Wedding {
	public int siblingOfGroom;
	public  int totalfarRelatives;
	public int ageOfGroom ;
	public int ageOfBride;
	public int varietyOfFood;
	public int groomFriends;
	public int preWeddingShootPrice;
	public long brokerNumber;
	public Boolean isItLoveMarriage;
	public int brideRelatives;
	public int groomRelatives;
	public int totalWeddingCards;
	public int weddingCardPrice;
	public int brideSideFriends;
	public int groomSideFriends;
	public int totalChildrens;
	public int weddingDate;
	public Boolean registerMarriage;
	public int totalChairs;
	public int weddingPrice;
	public long chowtryBookingNumber;
	public int egagementDate;
	public int dateOfWedding;
	public int engagementRingPrice;
	public int dowry;
	public int stageDecorationPrice;
	public int sareePrice;
	public int siblingOfBride;
	public int goldPrice;
	public int totalbrideSideRelatives;
	public int brokerFees;
	public int toatleGold;
	
	
	
	public Wedding(int siblingOfGroom, int totalfarRelatives, int ageOfGroom, int ageOfBride, int varietyOfFood,
			int groomFriends, int preWeddingShootPrice, long brokerNumber, Boolean isItLoveMarriage, int brideRelatives,
			int groomRelatives,int totalWeddingCards, int weddingCardPrice, int brideSideFriends,
			int groomSideFriends,int totalChildrens, int weddingDate, Boolean registerMarriage, int totalChairs,
			int weddingPrice, long chowtryBookingNumber, int egagementDate, int dateOfWedding,
			int engagementRingPrice,int dowry,int stageDecorationPrice, int sareePrice, int siblingOfBride,
			int goldPrice, int totalbrideSideRelatives,int brokerFees, int toatleGold) {
		
		this.siblingOfGroom = siblingOfGroom;
		this.totalfarRelatives = totalfarRelatives;
		this.ageOfGroom = ageOfGroom;
		this.ageOfBride = ageOfBride;
		this.varietyOfFood = varietyOfFood;
		this.groomFriends = groomFriends;
		this.preWeddingShootPrice = preWeddingShootPrice;
		this.brokerNumber = brokerNumber;
		this.isItLoveMarriage = isItLoveMarriage;
		this.brideRelatives = brideRelatives;
		this.groomRelatives = groomRelatives;
		this.totalWeddingCards = totalWeddingCards;
		this.weddingCardPrice = weddingCardPrice;
		this.brideSideFriends = brideSideFriends;
		this.groomSideFriends = groomSideFriends;
		this.totalChildrens = totalChildrens;
		this.weddingDate = weddingDate;
		this.registerMarriage = registerMarriage;
		this.totalChairs = totalChairs;
		this.weddingPrice = weddingPrice;
		this.chowtryBookingNumber = chowtryBookingNumber;
		this.egagementDate = egagementDate;
		this.dateOfWedding = dateOfWedding;
		this.engagementRingPrice = engagementRingPrice;
		this.dowry = dowry;
		this.stageDecorationPrice = stageDecorationPrice;
		this.sareePrice = sareePrice;
		this.siblingOfBride = siblingOfBride;
		this.goldPrice = goldPrice;
		this.totalbrideSideRelatives = totalbrideSideRelatives;
		this.brokerFees = brokerFees;
		this.toatleGold = toatleGold;
	}


	public String toString() {
		return "Wedding [siblingOfGroom=" + siblingOfGroom + ", totalfarRelatives=" + totalfarRelatives
				+ ", ageOfGroom=" + ageOfGroom + ", ageOfBride=" + ageOfBride + ", varietyOfFood=" + varietyOfFood
				+ ", groomFriends=" + groomFriends + ", preWeddingShootPrice=" + preWeddingShootPrice
				+ ", brokerNumber=" + brokerNumber + ", isItLoveMarriage=" + isItLoveMarriage + ", brideRelatives="
				+ brideRelatives + ", groomRelatives=" + groomRelatives + ", totalWeddingCards=" + totalWeddingCards
				+ ", weddingCardPrice=" + weddingCardPrice + ", brideSideFriends=" + brideSideFriends
				+ ", groomSideFriends=" + groomSideFriends + ", totalChildrens=" + totalChildrens + ", weddingDate="
				+ weddingDate + ", registerMarriage=" + registerMarriage + ", totalChairs=" + totalChairs
				+ ", weddingPrice=" + weddingPrice + ", chowtryBookingNumber=" + chowtryBookingNumber
				+ ", egagementDate=" + egagementDate + ", dateOfWedding=" + dateOfWedding + ", engagementRingPrice="
				+ engagementRingPrice + ", dowry=" + dowry + ", stageDecorationPrice=" + stageDecorationPrice
				+ ", sareePrice=" + sareePrice + ", siblingOfBride=" + siblingOfBride + ", goldPrice=" + goldPrice
				+ ", totalbrideSideRelatives=" + totalbrideSideRelatives + ", brokerFees=" + brokerFees
				+ ", toatleGold=" + toatleGold + "]";
	}




	public int hashcode() {
		final int prime=31;
		 int num=1;
		int results = prime*num;
		results=prime*num+(int)brokerFees;
		results=prime*num*totalbrideSideRelatives;
		results=prime*num*(int)goldPrice;
		results=prime*num*(int)toatleGold;
		results=prime*num*sareePrice;
		results=prime*num*(int)dowry;
		results=prime*num*(int)stageDecorationPrice;
		results=prime*num*(int)engagementRingPrice;
		results=prime*num*dateOfWedding;
		results=prime*num*egagementDate;
		results=prime*num*(int)chowtryBookingNumber;
		results=prime*num*(int)weddingPrice;
		results=prime*num*siblingOfBride;
		results=prime*num*weddingDate;
		results=prime*num*(int)totalChildrens;
		results=prime*num*(int)groomSideFriends;
		results=prime*num*siblingOfGroom;
		results=prime*num*totalfarRelatives;
		results=prime*num*ageOfGroom;
		results=prime*num*ageOfBride;
		results=prime*num*varietyOfFood;
		results=prime*num*(int)groomSideFriends;
		results=prime*num*preWeddingShootPrice;
		results=prime*num*(int)brokerNumber;
		results=prime*num*brideRelatives;
		results=prime*num*(int)groomRelatives;
	    results=prime*num*(int)totalWeddingCards;
		results=prime*num*weddingCardPrice;
		results=prime*num*brideSideFriends;
		results=prime*num*registerMarriage.hashCode();
		results=prime*num*isItLoveMarriage.hashCode();
		
		
		return results;
	}

}
