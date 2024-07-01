package BasicJavaPrograms;
//Perform left rotate 
import java.util.Arrays;

public class Array10 
{
	public static void leftRotate(int[] a, int n)
	{
		//1st logic
//		while(n!=0)
//		{
//			int temp = a[0];
//			for (int i = 1; i < a.length; i++) {
//				a[i - 1] = a[i];
//			}
//			a[a.length - 1] = temp;
//			
//			n--;
//		}
		 
		//2nd logic
		while(n!=0)
		{
			for (int i= 1; i<a.length;i++) //by swapping the numbers
			{
				int temp = a[i-1];
				a[i-1] = a[i];
				a[i] = temp;
			}
			n--;
		}
		System.out.print("After left rotate --->");
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) 
	{
		int a[] = {7,1,3,6,4,8};
		
		System.out.print("Befor left rotate --->");
		System.out.println(Arrays.toString(a));
		
		leftRotate(a,8);

	}

}
