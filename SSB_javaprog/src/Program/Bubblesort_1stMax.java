package Program;

public class Bubblesort_1stMax {

	public static void main(String[] args) {
		int a[]= {6,1,5,2,4,3};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}
		}
		
		System.out.println(a[0]);	
		
	}
}