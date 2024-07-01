package BasicJavaPrograms;
//Print prime number in given range(1st Logic)
import java.util.Scanner;

public class PrimeNumberRange {
	
	public static void primeNumber(int num)
	{
		for(int i =1;i<=num;i++)
		{
			int count=0;
			for(int j =1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Prime number from 1 to "+num);
		primeNumber(num);

	}

}
