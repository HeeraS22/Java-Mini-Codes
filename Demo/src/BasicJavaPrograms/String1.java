package BasicJavaPrograms;
//Find the length of the String
public class String1 
{

	public static void main(String[] args) 
	{
		String s ="java";
	                                                                                          
		char[] c = s.toCharArray();
		
		int count = 0;
		
		for(char x :c)
		{
			System.out.println(x);
			count++;
		}
		System.out.println("Length of the String is "+count); //4

	}

}
