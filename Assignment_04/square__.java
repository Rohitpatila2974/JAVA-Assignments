package Assignment_04;

public class square__ 
{
	int x=3;
	double y;
	
	int square()
	{
		System.out.println("Square of 3 is :"+Math.pow(x, 2));
		return x;
	}
	double square(double y)
	{
	
		System.out.println("Square of 0.2 is :"+Math.pow(y, 2));
		return y;
	}
	
	
	public static void main(String args[])
	{
		square__ s=new square__();
		s.square();
		s.square(0.2);
	}
}
