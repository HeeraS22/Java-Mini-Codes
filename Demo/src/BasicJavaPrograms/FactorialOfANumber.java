package BasicJavaPrograms;

//Find the factorial of a given number
public class FactorialOfANumber 
{
	public static void fact(int num)
	{
		int fact = 1;
		//1st logic
//		for(int i = 2; i<=num ; i++)
//		{
//			fact = fact * i;
//		}
		
//		for(int i = 1; i<=num ; i++)
//		{
//			fact = fact * i;
//		}
		//2nd Logic
		for(int i = num; i>=2 ; i--)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) 
	{
		int num = 6;
		fact(num);
	}
}
