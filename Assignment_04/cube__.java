package Assignment_04;

public class cube__ 
{
	int x=3;
	double y;
	
	int pow()
	{
		System.out.println("Cube of 3 is :"+Math.pow(x, 3));
		return x;
	}
	
	double pow(double y)
	{
		System.out.println("Cube of 0.2 is :"+Math.pow(y, 3));
		return y;
	}
	
	public static void main(String args[])
	{
		cube__ s=new cube__();
		s.pow();
		s.pow(0.2);
	}

}
