package classes_constructor;

public class ElectronicToy 
{
	int modelno;
	Toy m;
	
	ElectronicToy(int modelno,Toy c)
	{
		this.modelno=modelno;
		m=c;
		
	}
	void printall()
	{
		System.out.println("Model Number :"+this.modelno);
		m.Display();
		m.display();
	}
	
	public static void main(String args[])
	{
		
		Toy t=new Toy("Tractor", 200);
		ElectronicToy e=new ElectronicToy(123, t);
		e.printall();
 
	}

}
