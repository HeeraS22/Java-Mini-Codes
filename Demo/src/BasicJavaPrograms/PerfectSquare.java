package BasicJavaPrograms;
//Check whether the number is Perfect square or not
public class PerfectSquare {
	
	public static void perfectSquare(int num)
	{
		boolean f = false;
		for(int i=1;i<=num/2;i++)
		{
			if(i*i==num)
			{
				f = true;
				break;
			}
		}
		if(f==true)
			System.out.println(num+" is a perfect square");
		else
			System.out.println(num+" is not a perfect square");
	}

	public static void main(String[] args) {
		int num = 9;
		perfectSquare(num);

	}

}
