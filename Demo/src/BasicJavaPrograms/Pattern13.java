package BasicJavaPrograms;

import java.util.Scanner;

public class Pattern13 {

	public static void patt(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=60;j++)
				System.out.print(" ");
			for(int j=1;j<=row-i;j++) // to print space
				System.out.print(" ");
			for(int j=1;j<=(i*2)-1;j++)
			{
				if(j==1 || j==(i*2)-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=row-1;i>=1;i--)
		{
			for(int j=1;j<=60;j++)
				System.out.print(" ");
			for(int j=1;j<=row-i;j++) 
				System.out.print(" ");
			for(int j=1;j<=(i*2)-1;j++)
			{
				if(j==1 || j==(i*2)-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row ");
		int row = sc.nextInt();
		if(row%2==0)
			row+=1;
		patt(row);
	}

}
