package BasicJavaPrograms;

//Exact the special characters in the given string
public class ArrangeString {

	public static void main(String[] args) 
	{
		String s = "education!@123";
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char c = s.charAt(i);
			
			if(!(c>='a' && c<='z') && !(c>='0' && c<='9'))
			{
				System.out.print(c);
			}
		}
	}
}
