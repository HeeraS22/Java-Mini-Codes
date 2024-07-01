package BasicJavaPrograms;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) 
	{
		//Print first two integer 
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Mango");
		al.add(55.3f);
		al.add(40);
		al.add(55);
		al.add("Orange");
		al.add('c');
		
		int count = 0;
		for(Object o : al)
		{
			if(o instanceof Integer )
			{
				System.out.println(o);
				count++;
				if(count==2)
					break;
			}
			
		}

	}

}
