package BasicJavaPrograms;
//Convert the string to lower case
public class String4 {

	public static void main(String[] args) 
	{
		String s = "Good MORNING";
		String res = "";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>='A' && c<='Z')
			{
				int x = (int)c;
				x+=32;
				c = (char)x;
				res = res+c;
			}
			else
			{
				res = res+c;
			}
		}
		System.out.println("Lower case string: "+res);
	}

}
