package BasicJavaPrograms;
//Swapping 1st and last elements in an array
import java.util.Arrays;

public class Array9 
{
	public static void swap(int[] a)
	{
		int temp = a[0];
		a[0] = a[a.length-1];
		a[a.length-1] = temp;
		
//		a[0] = a[0] + a[a.length-1];
//		a[a.length-1] = a[0] - a[a.length-1];
//		a[0] = a[0] - a[a.length-1];
		
//		a[0] = a[0]*a[a.length-1];
//		a[a.length-1] = a[0]/a[a.length-1];
//		a[0] = a[0]/a[a.length-1];
		
//		a[0] = a[0]^a[a.length-1];
//		a[a.length-1] = a[0]^a[a.length-1];
//		a[0] = a[0]^a[a.length-1];
		
		//a[0] = a[a.length-1] - a[0] + (a[a.length-1]=a[0]);
		
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		System.out.println("============");
		swap(a);
	}

}
