package BasicJavaPrograms;

//Find the maximum and minimum number in an array
public class MinMaxInArray {

	public static void main(String[] args) {
		int [] a = {20,30,100,50,40,76,88,10};
		int highest = a[0];
		int lowest = a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(highest<a[i])
				highest = a[i];
			if(lowest>a[i])
				lowest = a[i];
		}
		System.out.println(highest);
		System.out.println(lowest);
	}

}