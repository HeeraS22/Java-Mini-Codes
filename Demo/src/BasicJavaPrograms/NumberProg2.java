package BasicJavaPrograms;
//Check the power of the given number
public class NumberProg2 {

	public static void power(int x, int n)
	{
		int pow = 1;
		for (int i=1; i<=n ; i++)
		{
			pow = pow * x;
		}
		System.out.println(pow);
		
		//System.out.println(Math.pow(x, n)); // in-build method
		
	}
	public static void main(String[] args) 
	{
		int x = 3;
		int n = 4;
		power(x, n);
	}
}
