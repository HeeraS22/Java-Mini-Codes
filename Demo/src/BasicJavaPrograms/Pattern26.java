package BasicJavaPrograms;
import java.util.Scanner;

public class Pattern26 {

	public static void patt(int row)
	{
		int mid = row/2+1;
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<=row*2;j++)
			{
		            if(j==1 || (j==i && j<=mid) ||(j==row ) ||(i+j==row+1 && j>mid))
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
