package BasicJavaPrograms;
//To find the frequency of the elements in an array
import java.util.Arrays;

public class Array13 
{
	public static void freq(int[] a) 
	{
		int f[] = new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			f[i] = 1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]!=-1 && a[j]!=-1 && a[i]==a[j])
				{
					a[j] = -1;
					f[i]++;
				}
			}
		}
		
		for(int i =0;i<a.length;i++)
		{
			if(a[i]!=-1 && f[i]>2)
			{
				System.out.println(a[i]+" - "+f[i]);
			}
		}
	}

	public static void main(String[] args) 
	{
		int a[] = {2,5,4,2,8,13,4,2,9};
		System.out.println(Arrays.toString(a));
		freq(a);
	}
}