package BasicJavaPrograms;
//Check whether the number is Happy number or not
public class SquareProg {
	
	public static void logic(int num)
	{
		while(num!=1  &&  num!=4)
		{
			int sum=0;
			while(num>0)
			{
				int rem = num%10;
				int sq = rem*rem;
				sum = sum + sq;
				num = num/10;
			}
			num=sum;
		}
		if(num==1)
			System.out.println("Happy Number");
		else
			System.out.println("Not a happy number");
	}
	
	public static void main(String[] args) {
		int num = 49;
		logic(num);
	}

}
