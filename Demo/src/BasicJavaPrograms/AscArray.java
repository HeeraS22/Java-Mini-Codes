package BasicJavaPrograms;
//Arrange the array elements in ascending order
public class AscArray {

	public static void main(String[] args) {
		int [] a = {20,30,100,50,40,76,88};
		int temp =0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
			System.out.print(a[i]+", ");
		}

	}

}
