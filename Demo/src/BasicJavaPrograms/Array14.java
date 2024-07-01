package BasicJavaPrograms;
//To find minimum and maximum difference in the given elements
import java.util.Arrays;

public class Array14 
{
	public static void minAndMaxDiff(int[] a) 
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
//				int diff = Math.abs(a[i]-a[j]); // using in-built method
//				min = Math.min(min, diff);
//				max = Math.max(max, diff);
				
				int diff = a[i]-a[j]; //without in-built
				if(diff<0)
					diff*=-1;
				if(min>diff)
					min = diff;
				if(max<diff)
					max = diff;
			}
		}
		System.out.println("Minimum diff : "+min);
		System.out.println("Maximum diff : "+max);
	}
	public static void main(String[] args) 
	{
		int a[] = {10,2,8,6,3,20};
		System.out.println(Arrays.toString(a));
		minAndMaxDiff(a);
	}

}
