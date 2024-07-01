package BasicJavaPrograms;

import java.util.Stack;

public class Stack2 
{
	public static void main(String[] args) 
	{
		String str ="Java";
		
		Stack<Character> s = new Stack<Character>();
		
		System.out.println(str);
		
		for(int i=0;i<str.length();i++)
		{
			s.push(str.charAt(i)); //pushing the characters into stack 
		}
			
		String rev = "";
		
		while(!s.empty()) //popping the characters
		{
			char c = s.pop();
			rev = rev + c;
		}
		System.out.println(rev);
	}
}
