package BasicJavaPrograms;
//Count the number of vowels in the given String
public class CountVowels {

	public static void main(String[] args) 
	{
		//1st logic
//		String s = "education";
//		int count = 0;
//		
//		for(int i=0;i<=s.length()-1;i++)
//		{
//			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
//			{
//				count++;
//			}
//		}
//		System.out.println("Count of vowels is "+count);
		
		//2nd logic
		String s = "education";
		String s1 = "aeiou";
		int count = 0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			for(int j=0;j<=s.length()-1;j++)
			{
				if(s1.charAt(i)==s.charAt(j))
					count++;
			}
				
		}
		if(count>0)
			System.out.println("Count of vowels is "+count);
	}

}
