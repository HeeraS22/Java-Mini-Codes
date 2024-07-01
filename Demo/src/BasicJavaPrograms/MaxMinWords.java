package BasicJavaPrograms;

//Find maximum and minimum length word in a given string
public class MaxMinWords 
{
	public static void find(String[] s)
	{
		String min = s[0];
		String max = s[0];
		
		for(int i =0;i<s.length;i++)
		{
			if(min.length()>s[i].length())
				min = s[i];
			if(max.length()<s[i].length())
				max = s[i];
		}
		System.out.println("Maximum length word :"+max);
		System.out.println("Minimum length word :"+min);
	}
	public static void main(String[] args) 
	{
		String s = "big black bug is sitting on big black nose of big black dog";
		
		String[] str =s.split(" ");
		find(str);
	}

}