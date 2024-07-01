package BasicJavaPrograms;
//Check whether the number is strong number or not
public class StrongNumber {
	
	public static void strongNumber(int num)
	{
		int sum = 0;
		int temp = num;
		
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
		if(sum == temp)
			System.out.println(temp+" is a strong number");
		else
			System.out.println(temp+" is not a strong number");
	}

	public static void main(String[] args) {
		int num = 145;
		strongNumber(num);

	}

}
