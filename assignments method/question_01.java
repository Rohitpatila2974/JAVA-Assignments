package classes_constructor;

public class question_01
{
	String Name;
	int id;
	
	question_01(String N, int Id)
	{
		this.Name=N;
		this.id=Id;
		
	}
	void Display()
	{
		System.out.println("Name :"+this.Name);
		System.out.println("ID :"+this.id);
	}

	
	public static void main (String args[])
	{
		question_01 obj1=new question_01("Rohit", 123);
		obj1.Display();
		question_01 obj2=new question_01("Sarthak", 345);
		obj2.Display();
	}
}
