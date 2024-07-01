package BasicJavaPrograms;
//Print prime number in given range (2nd Logic)
public class PrimeNumberRange1 {
	public static void primeNoRange(int m, int n)
	{
		for(int j=m;j<=n;j++)
		{
			int num=j;
			int count=0;
			
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				count++;
			}
			if(count==2)
				System.out.print(num+"  ");

		}
	}

	public static void main(String[] args) {
		int m = 10;
		int n = 50;
		primeNoRange(m, n);
	}

}
