package Assignment_03;

public class question_13
{
public static void main(String args[])
{
	int a[]= {2,5,7,9,4,3,1};
	
	for(int i=0; i<7; i++)
	{
		int flag=0;
		for(int j=i+1; j<7; j++)
		{
			if(a[i]<=a[j])

				flag=1;
				break;
		}
		if(flag==0)
		{
			System.out.print(a[i]+" ");
		}
	}
}
}
