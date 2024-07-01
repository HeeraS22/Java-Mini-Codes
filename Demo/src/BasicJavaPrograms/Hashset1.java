package BasicJavaPrograms;

import java.io.ObjectInputStream.GetField;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Hashset1 {

	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(40);
		hs.add(55);
		hs.add(44);
		hs.add(60);
		hs.add(10);
		hs.add(65);
		
		System.out.println(hs);
		
		System.out.println(hs.contains(68));
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove(60));
		
		System.out.println(hs);
		
//		HashSet<Integer> hs1 = hs;
//		
//		System.out.println(hs.removeAll(hs1));
//		System.out.println(hs);
		
		LinkedList<Integer> li = new LinkedList<Integer>(hs);
		
		Collections.sort(li);
		System.out.println(li);
		
		
		for(int i=0;i<=li.size()-1;i++)
		{
			for(int j=i+1;j<li.size();j++)
			{
				if(li.get(i)>li.get(j))
				{
					Integer x = li.get(i);
					li.set(i,li.get(j));
					li.set(j, x);
				}
			}
		}	
		System.out.println("Sorting "+li);
	}
}
