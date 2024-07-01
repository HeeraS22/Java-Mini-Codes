package BasicJavaPrograms;

import java.util.Scanner;

public class Pattern14 {

	public static void patt(int row)
	{
		int mid = row/2+1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if((j==1 && i!=1) || (j==row && i!=1) || (i==mid) || (i==1 && j!=1 && j!=row))
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
