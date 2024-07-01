package BasicJavaPrograms;
//Combine 2 Arrays into new Array
import java.util.Arrays;

public class Array6 
{
	public static void main(String[] args) 
	{
		int a[] = {7,6,5};
		int b[] = {1,3,2};
		int c[] = new int[a.length+b.length];
		
		int temp = 0;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[i] = a[i];
			}
			else
			{
				c[i] = b[temp];
				temp++;
			}
			
		}	
		
		System.out.println(Arrays.toString(c));
	}
}
