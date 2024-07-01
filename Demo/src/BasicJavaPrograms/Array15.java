package BasicJavaPrograms;
//To find the union and intersection for the given 2 arrays
import java.util.Arrays;

public class Array15 
{
	public static int[] merge(int a[], int b[])
	{
		int c[] =new int[a.length+b.length];
		int temp=0;
		for(int i =0;i<c.length;i++)
		{
			if(i<a.length)
				c[i] = a[i];
			else
				c[i]= b[temp++];
			
		}
		return c;
	}
	
	public static int[] union(int a[],int b[])
	{
		int[] res = merge(a,b);
		int count=0;
		for(int i=0;i<res.length;i++)
		{
			for(int j=i+1;j<res.length;j++)
			{
				if(res[i]!=-1 && res[j]!=-1 && res[i]==res[j])
				{
					res[j] = -1;
					count++;
				}
			}
		}
		
		int arr[] =new int [res.length-count];
		int temp=0;
		for(int i =0;i<res.length;i++)
		{
			if(res[i]!=-1)
			{
				arr[temp++]=res[i];
			}
		}
		return arr;
	}
	public static int[] intersection(int a[],int b[])
	{
		int res[] = merge(a,b);
		int f[] = new int[res.length];
		int count=0;
		for(int i=0;i<res.length;i++)
		{
			f[i] = 1;
			for(int j=i+1;j<res.length;j++)
			{
				if(res[i]!=-1 && res[j]!=-1 && res[i]==res[j])
				{
					res[j] = -1;
					f[i]++;
				}
			}
			if(f[i]>=2)
				count++;
		}
		int [] duplicates = new int[count];
		int temp=0;
		
		for(int i =0;i<res.length;i++)
		{
			if(res[i]!=-1 && f[i]>=2)
			{
				duplicates[temp++]= res[i];
			}
		}
		return duplicates;
	}
	
	public static void main(String[] args) 
	{
		int a[] = {2,3,4};
		int b[] = {3,5,7,4};
		
		System.out.println("Array A :"+Arrays.toString(a));
		System.out.println("Array B :"+Arrays.toString(b));
		
		int union[] = union(a,b);
		int intersection[] = intersection(a,b);
		
		System.out.println("Union is :"+Arrays.toString(union));
		System.out.println("Intersection is :"+Arrays.toString(intersection));

	}

}
