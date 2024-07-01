package BasicJavaPrograms;
//Find the fist 'N' leap year
public class LeapYearFirstN 
{
	
	public static void leapYear(int start,int n)
	{
		int count=0;
		
		for(int i=start; count!=n ;i++)
		{
			int year = i;
			if(year%4==0 && (year%400==0 || year%100!=0))
			{
				System.out.println(year);
				count++;
			}
		}
	}

	public static void main(String[] args) {
		int start = 2000;
		int n = 5;
		leapYear(start, n);

	}

}
