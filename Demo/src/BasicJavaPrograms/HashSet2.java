package BasicJavaPrograms;

import java.util.HashSet;

public class HashSet2 
{
	public static void main(String[] args) 
	{
		String s = "big black bug is sitting on big black nose of big black dog";
		String[] str =s.split(" ");
		HashSet<String> hs = new HashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			hs.add(str[i]);
		}
		System.out.println(hs);
	}
}
