package Assignment_ExceptionHandling;
import java.util.Scanner;
public class Department extends Teacher
{
	String Departmentname;
	
	void getdata1()
	{
		Departmentname="MECHANICAL";
	}

	void show()
	{
		System.out.println("NAME OF DEPARTMENT :"+Departmentname);
	}

	public static void main(String args[])
	{
		try {
		int Departmentno;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter The Department Number");
		Departmentno=s.nextInt();
		
		if(Departmentno==10 || Departmentno==20 || Departmentno==30)
		{	
			Department d=new Department();
			System.out.println("NAME OF COLLEGE :"+d.nameofcollege);
			d.getdata();
			d.display();
			d.getdata1();
			d.show(); 
			System.out.println("DEPARTMENT NUMBER IS :"+Departmentno);
		}	
		else
			throw new Exception();
		} catch (Exception e)
		{
			System.out.println("THIS NOT A VALID DEPARTMENT NUMBER");		
		}
	}

}