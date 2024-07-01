package BasicJavaPrograms;

import java.util.Scanner;

public class Pattern31 {

	public static void patt(int row)
	{	
		int mid = row/2+1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if((i==1 && j<=mid && j!=mid) || (i==mid && j!=mid && j<=mid) || (i-j==mid-1)
						|| j==1 || (j==mid && i!=1 && i!=mid && i<=mid) )
				
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
		
		patt(row);
	}

}
