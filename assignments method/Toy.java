package classes_constructor;

public class Toy 
{
	String toyname;
	int price;
	static String madein="India"; 
	
	Toy()
	{
      		
	}
	Toy(String toyname, int price)
	{
		this.toyname=toyname;
		this.price=price;
	}
  
	static void display()
	{
		System.out.println(madein);
	}
	
	 void Display()
		{
			System.out.println(toyname);
			System.out.println(price);
		}

}