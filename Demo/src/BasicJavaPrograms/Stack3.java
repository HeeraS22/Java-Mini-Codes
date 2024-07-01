package BasicJavaPrograms;
//Reverse the words in the string
import java.util.Stack;

public class Stack3 
{
	
	public static void reverseOfstr(String s) 
	{
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				st.push(s.charAt(i));
			}
			else
			{

				while(!st.empty()) 
				{
					System.out.print(st.pop());
				}
			System.out.print(" ");
			}
		}
			while(!st.empty()) 
			{
				System.out.print(st.pop());
			}	
		
	}

	public static void main(String[] args) 
	{
		String s = "Java is lang";
		
		reverseOfstr(s);				
	}

}
