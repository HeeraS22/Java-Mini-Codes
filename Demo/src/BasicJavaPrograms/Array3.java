package BasicJavaPrograms;

//Print the Sum of array elements
public class Array3 
{
	public static void main(String[] args) 
	{
		int[] a = {14,22,45,35,50};
		
		System.out.println("Sum of array elements");
		
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];	
		}
		System.out.println(sum);
	}
}
