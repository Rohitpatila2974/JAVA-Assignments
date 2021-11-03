package DAY02;

public class MaxThreeNumber
{
	public static void main (String[] args)
	{
		int a=60;
		int b=80;
		int c=70;
		
		if(a>b)
		{
			if(a>c)
				System.out.println(a);
		else
		{
			System.out.println(c);
		}
		}
		else if (b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}
}
