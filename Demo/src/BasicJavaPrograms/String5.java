package BasicJavaPrograms;
//Count the number of words in the String
public class String5 
{
	public static void main(String[] args) 
	{
		String RESET = "\u001B[0m";
	    String RED = "\u001B[31m";
	    String GREEN = "\u001B[32m";
	    String b = "\u001B[46m";
	    
		String s1 ="My name is Heera ";
		
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(i==0 && s1.charAt(i)!=' '  || s1.charAt(i)!=' ' && s1.charAt(i-1)==' ')
				count++;
		}
		System.out.println(b+"Number of words in the String is "+count+RESET);
	}

}
