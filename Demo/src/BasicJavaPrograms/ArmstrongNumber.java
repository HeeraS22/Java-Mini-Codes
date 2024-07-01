package BasicJavaPrograms;
//Check the given number is Armstrong or not
public class ArmstrongNumber {
	
	public static void armstrong(int num)
	{
		int count = 0;
		int temp = num;
		int k = num;
		
		while(num>0)
		{
			count++;
			num = num/10;
		}
		int sum = 0;
		
		while(temp>0)
		{
			int rem = temp%10;
			int pow = 1;
			for(int i=1;i<=count;i++)
			{
				pow = pow*rem;
			}
			sum = sum + pow;
			temp = temp/10;
		}
		if(sum==k)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a armstrong number");
	}

	public static void main(String[] args) {
		int num = 153;
		armstrong(num);

	}
}
