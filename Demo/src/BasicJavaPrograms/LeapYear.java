package BasicJavaPrograms;
//Find whether the given year is leap year or not
public class LeapYear {
	
	public static boolean leapYear(int year)
	{
		if(year%4==0 && (year%400==0 || year%100!=0))
			return true;
		else
			return false;
	}

	public static void main(String[] args) 
	{
		int year = 2000;
		System.out.println(leapYear(year));

	}

}