package BasicJavaPrograms;

import java.util.Scanner;

public class Pattern8 {

	public static void patt(int row)
	{
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=row-i;j++) //To print space
				System.out.print(" ");
			for(int j=1;j<=(i*2)-1;j++) //To print stars
				System.out.print("*");
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
