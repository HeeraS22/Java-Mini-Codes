package BasicJavaPrograms;
//Print first 'N' prime numbers
public class PrimeNumberFirstN {
	
	public static void prime(int n)
	{
		int count=0;
		
		for(int i=1; count!=n ;i++)
		{
			int num=i;
			int c=0;
			for(int j=1;j<=num;j++)
			{
				if(num%j==0)
				{
					c++;
				}
			}
				if(c==2)
				{
					System.out.println(num);
					count++;
				}
					
		}
	}

	public static void main(String[] args) {
	int n = 10;
	prime(n);

	}

}