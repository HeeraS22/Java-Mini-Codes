package BasicJavaPrograms;
//check the 1st digit and the last digit of two arrays are same
public class Array8 
{
	
	public static boolean check(int[] a, int[] b)
	{
		return ((a[0]==b[0]) || (a[a.length-1])==(b[b.length-1]));
	}
	public static void main(String[] args) 
	{
		int[] a = {4,1,3,5};
		int[] b = {5,4,6,5};
		System.out.println(check(a,b));
	}

}
