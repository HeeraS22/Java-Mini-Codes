package BasicJavaPrograms;
//Find the duplicate words in a String
public class duplicateString 
{
	public static void main(String[] args) 
	{
		String s = "big black bug is sitting on big black nose of big black dog";
		String[] str = s.split(" ");
		
		int[] f = new int[str.length];
		
		for(int i=0;i<str.length;i++)
		{
			f[i] = 1;
			for(int j=i+1;j<str.length;j++)
			{
				if(!str[i].equals("@") && !str[j].equals("@") && str[i].equals(str[j]))
				{
					str[j]="@";
					f[i]++;
				}				
			}
		}
		for(int i=0;i<str.length;i++)
		{
			if(!str[i].equals("@") && f[i]>1)
			{
				System.out.println(str[i]);
			}
		}

	}

}