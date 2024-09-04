class SweetsRunner{
	public static void main(String [] args){
		Sweets sweet = new Sweets();
		
		sweet.customers=1500;
		sweet.sweetName="darward peda";
		sweet.fatContent=35.34f;
		sweet.profit=78.25f;
		sweet.years=3;
		sweet.isGoodOrBad=false;
		sweet.contactNum=6343647399l;
		sweet.varietySweets=20;
		sweet.month='f';
		
		System.out.println(sweet.customers);
		System.out.println(sweet.sweetName);
		System.out.println(sweet.varietySweets);
	}
}