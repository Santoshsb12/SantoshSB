package Program;

public class Bubblesort_1stMin {

	public static void main(String[] args) {
		int a[]= {6,9,5,2,2,4};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}	
		}
		System.out.println(a[1]);
	}
}
	
