package BasicJavaPrograms;
//Arrange the string in ascending order
public class String6 
{
	public static String arrangeInAsc(String s)
	{
		char[] c = s.toCharArray();
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
		String res = new String(c);
		return res;
	}
	public static void main(String[] args) 
	{
		String s = "MadAm";
		String s1 = s.toLowerCase();
		System.out.println(s1);
		
		System.out.println(arrangeInAsc(s1));
	}
}
