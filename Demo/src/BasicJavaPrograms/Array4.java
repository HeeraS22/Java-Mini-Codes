package BasicJavaPrograms;
//To find the sum of even numbers in an array
import java.util.Arrays;

public class Array4 
{

	public static void main(String[] args) 
	{
		int[] a = {14,22,45,35,50};
		
		System.out.println("Sum of even numbers in an array");
		
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			sum = sum+a[i];	
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(sum);
	}
}
