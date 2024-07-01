package BasicJavaPrograms;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) 
	{
		String s = "big black bug is sitting on big black nose of big black dog";
		String[] str =s.split(" ");
		HashSet<String> hs = new HashSet<String>();
		HashSet<String> duplicates = new HashSet<String>(); // create another HashSet to store duplicate words
		
		for(int i=0;i<str.length;i++)
		{
			if(!hs.add(str[i])) // if the word already present then condition will be true 
			{
				duplicates.add(str[i]); // add the duplicate words into the HashSet
			}
		}
		System.out.println(duplicates); // [big, black, on]

	}

}
