package BasicJavaPrograms;
//Copy the elements of 'A' array to 'B' array
import java.util.Arrays;

public class Array5 
{
	public static void main(String[] args) 
	{
		int[] a = {1,5,7};
		int[] b = new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[i];
		}
		
		a[1] = 50;
		
		System.out.println(Arrays.toString(a));
			
		System.out.print("Elements in array B ");
		
		System.out.println(Arrays.toString(b));
		
	}

}
