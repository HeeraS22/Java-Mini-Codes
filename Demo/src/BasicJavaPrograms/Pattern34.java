package BasicJavaPrograms;

import java.util.Scanner;

public class Pattern34 {

	public static void patt(int row)
	{	
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if( (i==row && j!=row && j!=1) || 
						(j==1 && i!=1 && i!=row)|| (j==row && i!=1 && i!=row))
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
