package BasicJavaPrograms;

import java.util.Scanner;

public class PatternZ {
	public static void patt(int row)
	{	
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i==1 ||i==row || i+j==row+1)
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
