package Assignment_ExceptionHandling;

public class shape
{

	
	class cirlce
	{
		int d=100;
		float c=3.142f;
		
		void display()
		{
			System.out.println("The Are of circle is :"+c*d*d);
		}
		
	}
	
	class rectangle
	{
		int l=100;
		int b=100;
		
		void show()
		{
			System.out.println("The Area of Reactangle is :"+l*b);
		}
	}
	
	public static void main(String args[])
	{
		shape s=new shape();
		shape.cirlce c=s.new cirlce();
		c.display();
		shape.rectangle r=s.new rectangle();
		r.show();
			
	}

}
