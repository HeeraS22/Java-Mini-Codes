package BasicJavaPrograms;
//Find the leap years in given range
public class LeapYearRange {
	
	public static void leapYear(int m,int n)
	{
		for(int i=m;i<=n;i++)
		{
			int year = i;
			if(year%4==0 && (year%400==0 || year%100!=0))
				System.out.println(year);
		}
	}

	public static void main(String[] args) {
		int m = 2000;
		int n = 4000;
		leapYear(m, n);
	}

}