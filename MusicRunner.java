class MusicRunner{
	public static void main(String [] args){
		Music details = new Music();
		
		details.tutionFees=15000;
		details.instrumentName="harmonium";
		details.instrumentPrice=2345.2f;
		details.instrumentWeight=99.33d;
		details.isGoodOrBad=false;
		details.cross=5;
		details.contactNum=3453456787l;
		details.month='f';
		
		System.out.println(details.tutionFees);
		System.out.println(details.instrumentWeight);
		System.out.println(details.instrumentName);
	}
}