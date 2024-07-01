package BasicJavaPrograms;
//count the frequency of the character
public class PPPPPPPP 
{
	    public static void main(String[] args) 
	    {
	        String s = "xxyyyzzzzz";
	        System.out.println(compressString(s));
	    }

	    public static String compressString(String s) 
	    {
	        StringBuilder output = new StringBuilder();
	        int count = 1;

	        for (int i = 1; i < s.length(); i++) 
	        {
	            if (s.charAt(i) == s.charAt(i - 1)) 
	            {
	                count++;
	            } else {
	                output.append(s.charAt(i - 1)).append(count);
	                count = 1;
	            }
	        }
	        output.append(s.charAt(s.length() - 1)).append(count);

	        return output.toString();
	    }
}
