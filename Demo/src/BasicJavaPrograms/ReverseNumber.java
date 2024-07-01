package BasicJavaPrograms;
//Reverse of a number
public class ReverseNumber {

	public static int reverse(int num)
	{
		int rev = 0;
		while(num>0)
		{
			int rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
		}	
		return rev;	
	}
	public static void main(String[] args) {
		int num = 45631;
		System.out.println(reverse(num));

	}

}