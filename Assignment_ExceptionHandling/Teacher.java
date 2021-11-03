package Assignment_ExceptionHandling;

public class Teacher  implements college
{
	String name;
	String Qualification;
	
	void getdata()
	{
		name="ROHIT";
		Qualification="BE MECHANICAL";
	}
	void display()
	{
		System.out.println("NAME OF STUDENT :"+name);
		System.out.println("OUALIFICATION OF STUDENT :"+Qualification);	
	}
}
	
	