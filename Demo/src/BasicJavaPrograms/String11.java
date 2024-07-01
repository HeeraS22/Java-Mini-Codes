package BasicJavaPrograms;
//Count of similar substring in the given string
public class String11 
{

	public static void main(String[] args) 
	{
		String s = "catcadodogcatcdogcatcadogdog";
		String s1 = "catcadodogcatcdogcatcadogdog";
		
		int count = 0;
		int count1= 0;
		while(s.contains("cat"))
		{
			int index = s.indexOf("cat");
			s = s.substring(index+3);
			count++;
			
		}
		while(s1.contains("dog"))
		{
			int index = s1.indexOf("dog");
			s1 = s1.substring(index+3);
			count1++;
		}
		
		System.out.println("Count of cat :"+count);
		System.out.println("Count of dog :"+count1);

	}

}
