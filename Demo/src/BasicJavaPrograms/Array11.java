package BasicJavaPrograms;
//Perform right rotate
import java.util.Arrays;

public class Array11 
{
	public static void rightRotate(int[] a, int n)
	{
		while(n!=0)
		{
			int temp = a[a.length-1];
			for (int i = a.length-2; i>=0;i--) 
			{
				a[i+1] = a[i];
			}
			a[0] = temp;
			
			n--;
		}
		 
		
//		while(n!=0)
//		{
//			for (int i = a.length-2; i>=0;i--)//by swapping the numbers
//			{
//				int temp = a[i];
//				a[i] = a[i+1];
//				a[i+1] = temp;
//			}
//			n--;
//		}
		System.out.print("After right rotate --->");
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) 
	{
		int a[] = {7,1,3,6,4,8};
		
		System.out.print("Befor right rotate --->");
		System.out.println(Arrays.toString(a));
		
		rightRotate(a,3);
	}
}