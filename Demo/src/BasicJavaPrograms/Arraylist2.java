package BasicJavaPrograms;

import java.util.ArrayList;

public class Arraylist2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Orange");
		al.add("Banana");
		al.add("Grapes");
		

		System.out.println(al);
		System.out.println(al.isEmpty());
	}
}
