package BasicJavaPrograms;
//Check whether the number is Perfect number or not
public class PerfectNumber 
{
	public static void perfectNumber(int num)
	{
		int sum = 0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
				sum = sum+i;
		}
		if(sum==num)
			System.out.println("Perfect number");
		else
			System.out.println("Not a perfect number");
	}
	public static void main(String[] args) 
	{
		int num = 8128; //496
		perfectNumber(num);
	}
}