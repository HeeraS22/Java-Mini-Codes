package BasicJavaPrograms;
//Check whether the given string is palindrome or not
public class String8 
{
	public static boolean palindrome(String s)
	{
		String rev ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		boolean b =rev.equalsIgnoreCase(s);
		return b;
	}
	public static void main(String[] args) 
	{
		String s = "radar";
		System.out.println("Is "+s+" a palindrome ? "+palindrome(s));
	}
}