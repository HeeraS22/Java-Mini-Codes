package BasicJavaPrograms;
//Check whether the number is Prime number or not
import java.util.Scanner;

public class PrimeNumber {
	
	public static void primeNumber(int num)
	{
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
			count++;
			}
		}
		if(count==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
//		for(int i=1;i<=num;i++)
//		{
//			if(num%i==0)
//			{
//			count++;
//			}
//		}
//		if(count==2)
//		{
//			System.out.println("Prime number");
//		}
//		else
//		{
//			System.out.println("Not a prime number");
//		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		primeNumber(num);

	}

}
