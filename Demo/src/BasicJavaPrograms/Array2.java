package BasicJavaPrograms;

//Print the array values in reverse order
public class Array2 
{
	public static void main(String[] args) 
	{
		int[] a = {14,22,45,35,50};
		
		System.out.println("Printing array values in reverse order");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
