package BasicJavaPrograms;
//Find vowels and consonants in the given string
public class String3 
{
	public static void main(String[] args) 
	{
		String s ="Java is programming language";
		int vowels =0;
		int cons=0;
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			{
				vowels++;
			}
			else
			{
				if(c!=' ')
				cons++;
			}
		}
		System.out.println("Vowels :"+vowels);
		System.out.println("Consonants :"+cons);
	}
}