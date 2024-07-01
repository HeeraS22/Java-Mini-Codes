package BasicJavaPrograms;
//Find the maximum and minimum word in a given String
public class MinMaxString 
{
	public static String[] removeDuplicate(String[] str)
	{
		int count = 0;
		
		for(int i=0; i<str.length; i++)
		{
			for(int j=i+1; j<str.length; j++)
			{
				if(!str[i].equals("@") && !str[j].equals("@") && str[i].equals(str[j]))
				{
					str[j] = "@";
					count++;
				}				
			}
		}
		
		String[] new_str = new String[str.length - count];
		
		int temp = 0;
		for(int i=0; i<str.length; i++)
		{
			if(!str[i].equals("@"))
			{
				new_str[temp++] = str[i];
			}
		}
		return new_str;
	}

	public static int findMinval(int[] a)
	{
		int min = Integer.MAX_VALUE;
		int index = 0;
		
		for(int i=0; i<a.length; i++)
		{
			if(min > a[i])
			{
				min = a[i];
				index = i;
			}
		}
		return index;
	}
	
	public static int findMaxval(int[] a)
	{
		int max = Integer.MIN_VALUE;
		int index = 0;
		
		for(int i=0; i<a.length; i++)
		{
			if(max < a[i])
			{
				max = a[i];
				index = i;
			}
		}
		return index;
	}
	
	public static int[] createStringLengthArray(String[] str)
	{
		int[] l = new int[str.length];
		for(int i=0; i<str.length; i++)
		{
			l[i] = str[i].length();
		}
		return l;
	}
	
	public static void findLength(String s)
	{
		String[] str = s.split(" ");
		str = removeDuplicate(str);
		int[] l = createStringLengthArray(str);
		
		int min = findMinval(l);
		int max = findMaxval(l);
		
		System.out.println("Maximum length word: " + str[max]);
		System.out.println("Minimum length word: " + str[min]);
	}
	
	public static void main(String[] args) 
	{
		String s = "big black bug is sitting on big black nose of big black dog";
		findLength(s);
	}
}