package BasicJavaPrograms;
//Count the number of 'e' character in a given string
public class NumberofChar {

	public static void main(String[] args) {
		String s = "Welcome to Selenium";
		int count = 0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='e')
			{
				count++;
			}
		}
		System.out.println("Count of 'e' is "+count);

	}

}
