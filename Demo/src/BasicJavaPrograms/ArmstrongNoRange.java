package BasicJavaPrograms;

import java.util.Scanner;
//Find Armstrong number in given range
public class ArmstrongNoRange {
	
	public static void armstrong(int num)
	{
		for(int i =1;i<=num;i++)
		{
			int temp=i;
			int temp1=i;
			int count=0;
			int sum=0;
			while(temp>0)
			{
				count++;
				temp = temp/10;
			}
			while(temp1>0)
			{
				int res= temp1%10;
				int pro =1;
				for(int j=1;j<=count;j++)
				{
					pro = pro*res;
				}
				sum = sum+pro;
				temp1=temp1/10;
			}
			if(i==sum)
			{
				System.out.println("Armstrong number :"+i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		armstrong(num);

	}

}
