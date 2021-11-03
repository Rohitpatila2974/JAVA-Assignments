package Assignment_03;

public class question_05 
{
public static void main(String args[])
{
	int i,j;
	int a[]= {6,4,7,1,9};
	for(i=0; i<5-1; i++)
	{
		for( j=0; j<5-1-i; j++);
		{int temp;
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;	
	        }
		}
	}
	for(i=0; i<5; i++)
	{
		System.out.println(a[i]+" ");
	}
}
}
