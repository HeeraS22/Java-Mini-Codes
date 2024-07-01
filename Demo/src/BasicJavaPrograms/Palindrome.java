package BasicJavaPrograms;
//Check whether the number is Palindrome number or not
public class Palindrome {
	
	public static void palindrome(int num)
	{
		int temp =num;
		int rev = 0;
		while(num>0)
		{
			int rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
		}	
		if(rev == temp)
			System.out.println("Palindrome number");
		else
			System.out.println("Not a palindrome number");
	}

	public static void main(String[] args) {
		int num = 121;
		palindrome(num);

	}

}