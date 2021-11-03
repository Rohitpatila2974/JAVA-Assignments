package DAY02;

public class febonacies 
{
	public static void main (String[] args )
	{
		int N1=0;
		int N2=1;
		int n=10;
		int i;
		int N3;
		System.out.println(N1);
		System.out.println(N2);
		
		for(i=2; i<=n; ++i)
		{
		N3=N1+N2;
		N1=N2;
		N2=N3;
		System.out.println(N3);
		}
	}

}
