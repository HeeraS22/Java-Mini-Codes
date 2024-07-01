package BasicJavaPrograms;
//Check whether the number is spy number or not
public class NumberProg1 {
	
	public static void sypNumber(int num)
	{
		int sum = 0;
		int prod = 1;
		while(num!=0)
		{
			int rem = num%10;
			sum = sum + rem;
			if(rem!=0)
				prod = prod * rem;
			num = num/10;
		}
		if(prod==sum)
			System.out.println("It is a spy number");
		else
			System.out.println("Not a spy number");
	}

	public static void main(String[] args) 
	{
		int num = 202;
		sypNumber(num);
	}
}
