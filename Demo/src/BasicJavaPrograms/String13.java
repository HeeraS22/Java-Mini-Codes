package BasicJavaPrograms;
//Conversion of string to upper case
public class String13 {

	public static String upperCase(String s)
	{
	
		String res = "";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>='a' && c<='z')
			{
				int x = (int)c;
				x-=32;
				c= (char)x;
				res = res+c;
			}
			else
			{
				res = res+c;
			}
		}
		return res;
	}

	public static void main(String[] args) 
	{
		String RESET = "\u001B[0m";
	     String RED = "\u001B[31m";
	     String GREEN = "\u001B[32m";
	     String BLUE = "\u001B[34m";
	     String PURPLE = "\u001B[35m";
		
		//System.out.println(upperCase("congratulations"));
		System.out.println(GREEN+"String : "+upperCase("congratulations Hi")+RESET);
	}

}

