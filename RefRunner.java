class RefRunner{
	public static void main(String [] args){
		Ref.setRefName("whirpool");
		Ref.seRefWeight(2345.2f);
		Ref.setCost(533234.99d);
		Ref.setIsRefIsGood(true);
		Ref.setMonth('j');
		Ref.setPhNum(6364670L);
		Ref.setHeight(15);
	String name=Ref.getRefName();
		float weight=Ref.getRefWeight();
		double cost=Ref.getCost();
	    boolean ref=Ref.isRefIsGood();
		long num=Ref.getPhNum();
		char month=Ref.getMonth();
		int height=Ref.getHeight();
		System.out.println(name);
		System.out.println(weight);
	System.out.println(cost);
		System.out.println(ref);
		System.out.println(month);
		System.out.println(height);
		System.out.println(num);
		
		
		
	}
}