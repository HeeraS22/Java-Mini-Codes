package BasicJavaPrograms;

public class Pattern01 {
	
	public static void p(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				System.out.print((i+j)%2);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		p(4);

	}

}
