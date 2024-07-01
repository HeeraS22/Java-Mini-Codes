package BasicJavaPrograms;
//Conversion of string to lower case
public class String12 {

	public static String lowerCase(String s)
	{
	
		String res = "";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>='A' && c<='Z')
			{
				int x = (int)c;
				x+=32;
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
		String s = "JAVA";
		//Stack<Character> st = new Stack<Character>();
		
//		for(int i=0;i<s.length();i++)
//		{
//			st.push(s.charAt(i));  
//		}
		System.out.println(lowerCase(s));
	}

}
