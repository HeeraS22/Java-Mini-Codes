package BasicJavaPrograms;
//Find anagram without in-built methods
import java.util.Arrays;

public class String9 
{
//	public static void main(String[] args) //find anagram with help of in-built methods
//	{
//		String s1 = "RACE";
//		String s2 = "CARE";
//		
//		char[] c1 = s1.toCharArray();
//		char[] c2 = s2.toCharArray();
//		
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		
//		System.out.println(Arrays.equals(c1, c2));
//	}
	
	public static char[] toCharArray(String s)
	{
		char[] c = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			c[i] = s.charAt(i);
		}
		return c;
	}
	
	public static void sort(char[] c)
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}				
			}
		}
	}
	public static boolean equals(char[] c1,char[] c2)
	{
		boolean flag = true;
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) //find anagram without in-built methods
	{
		String s1 = "RACE";
		String s2 = "CARE";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("These are not anagram");
		}
		else
		{
			char[] c1 = toCharArray(s1);
			char[] c2 = toCharArray(s2);
			
			sort(c1);
			sort(c2);
			
			if(equals(c1, c2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not a anagram");
			}
		}
		
	}

}
