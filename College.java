class College{
	public static void main(String [] args)
	{
		int fees=105000;
		int noBranches=100;
		int noStudents=10000;
		int totalStaff=90;
		int []  details={fees,noBranches,noStudents,totalStaff};
		details[0]=100000;
		fees=details[0];
		for(int i=0;i<3;i++){
			System.out.println(details[i]);
		}
		
	}
}