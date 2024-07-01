package BasicJavaPrograms;

import java.util.Scanner;

public class Pattern12 {

	public static void patt(int row)
	{
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=row-i;j++) 
				System.out.print(" ");
			for(int j=1;j<=(i*2)-1;j++)
			{
				if(j==1 || j==(i*2)-1 || i==row)
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
