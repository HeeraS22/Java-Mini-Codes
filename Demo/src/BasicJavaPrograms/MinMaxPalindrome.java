package BasicJavaPrograms;
//Find the maximum and minimum palindrome in a given String
public class MinMaxPalindrome {
	public static void find(String[] s)
	{
		String min = s[0];
		String max = s[0];
		
		for(int i =1;i<s.length;i++)
		{
			if(min.length()>s[i].length())
				min = s[i];
			if(max.length()<s[i].length())
				max = s[i];
		}
		System.out.println("Maximum length word :"+max);
		System.out.println("Minimum length word :"+min);
	}
	
	public static boolean isPalindrome(String s)
	{
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		boolean b =rev.equalsIgnoreCase(s);
		return b;
	}
	
	public static void findPalindrome(String[] s)
	{
		String min = s[0];
		String max = s[0];
		
		for(int i =0;i<s.length;i++)
		{
			if(min.length()>s[i].length() && isPalindrome(s[i]))
				min = s[i];
			if(max.length()<s[i].length() && isPalindrome(s[i]))
				max = s[i];
		}
		System.out.println("Maximum palindrome word :"+max);
		System.out.println("Minimum Palindrome word :"+min);
		
	}
	public static void main(String[] args) 
	{
		String s = "wow that madam knows malayalam";
		
		String[] str =s.split(" ");
		
		findPalindrome(str);
	}
}