package BasicJavaPrograms;

import java.util.Stack;

public class Stack1
{

	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push(25);
		s.push(31);
		s.push(55);
		s.push(44);
		s.push("Orange");
		s.push(15);
		s.push(66);
		
		//Stack operations
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.capacity());
		System.out.println(s.search(55));
		System.out.println(s.firstElement());
		System.out.println(s.get(3));
		System.out.println(s.equals(s));
		System.out.println(s.clone());
		System.out.println(s.lastElement());
		System.out.println(s.peek());
		System.out.println(s.remove(2));
		System.out.println(s);
		

	}

}