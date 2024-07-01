package BasicJavaPrograms;
//Check whether the number is strong number or not in given range
public class StrongNumberRange {
	
	public static void strongNum(int m, int n)
	{
		for(int j=m;j<=n;j++)
		{
		int num = j;
		int sum = 0;
		
		while(num>0)
		{
			int rem = num%10;
			int fact = 1;
			for(int i = 1;i<=rem;i++)
			{
				fact = fact*i;
			}
			sum = sum+fact;
			num = num/10;
		}
	
		if(sum == j)
			System.out.println(j);
		}
	}

	public static void main(String[] args) {
		int m = 1;
		int n = 200000;
		strongNum(m, n);

	}

}
