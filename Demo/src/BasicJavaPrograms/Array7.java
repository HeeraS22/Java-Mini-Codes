package BasicJavaPrograms;
//Printing even place elements in an array
public class Array7 
{
	public static void printEvenPlaceNo(int[] a, int[] b)
	{
		int k = 0;
		for(int i : a)
		{
			if(k%2==0)
				System.out.println(i);
			k++;
		}
		int t = 0;
		for(int i : b)
		{
			if(t%2==0)
				System.out.println(i);
			t++;
		}
	}
	public static void main(String[] args) 
	{
		int[] a = {1,5,7,2,3};
		int[] b = {2,4,7,5};
		
		printEvenPlaceNo(a,b);

	}

}
