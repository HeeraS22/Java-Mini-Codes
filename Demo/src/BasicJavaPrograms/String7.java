package BasicJavaPrograms;
//Reverse of a String
public class String7 
{
	public static void main(String[] args) 
	{
		String s = "Good morning";
		String rev="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(i==0 && s.charAt(i)!=' '  || s.charAt(i)!=' ' && s.charAt(i-1)==' ')
				count++;
			
		}
		if(count>1)
		{
			for(int j=s.length()-1;j>=0;j--)
			{
				rev=rev+s.charAt(j);
			}
			System.out.println(rev);
		}

	}

}
