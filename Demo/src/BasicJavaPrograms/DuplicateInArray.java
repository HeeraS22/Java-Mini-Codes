package BasicJavaPrograms;
//Print the count of the duplicate elements in an array
public class DuplicateInArray {

	public static void main(String[] args) {
		int [] a = {20,10,30,100,50,20,40,40,76,88,40,10};
		
		for(int i=0;i<=a.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=a.length-1;j++)
			{
				if(a[i]==a[j] && i>j)
				{
					break;
				}
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>1)
				System.out.println(a[i]+" ---> "+count);
		}

	}

}
