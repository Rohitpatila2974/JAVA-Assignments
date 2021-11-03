package classes_constructor;

public class Employee 
{
	float SPH=1000;
	float WHPD=8;
	float salary;
	
	float getInfo()
	{
		salary=(30*SPH);
		System.out.println("Salary :"+salary);
		return salary;
	}
	
	void Addsal()
	{
		if(salary<50000)
		{
		 salary=salary+10000;
		 System.out.println("Add 10000 to Salary :"+salary);
		}
	}
	
	void Addwork()
	{
		salary=salary+5000;
		if(WHPD>6)
		{
			System.out.println("Adds 5000 to salary :"+salary);
		}
		else
		{
			System.out.println("You was Worked only 5hrs :");
		}
	}
	
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.getInfo();
		e.Addsal();
		e.Addwork();
	}
}
