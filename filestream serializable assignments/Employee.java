package all;
import java.io.*;
public class Employee
{
	String name;
	int age;
	int salary;
	
	void getdata() throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i);
		System.out.println("Name Of Employee :");
		name=b.readLine();
		System.out.println("Enter The Age Of Employee :");
		age=Integer.parseInt(b.readLine());
		System.out.println("Enter The Salary Employee :");
		salary=Integer.parseInt(b.readLine());
	}
	 void Display()
	 {
		 System.out.println("NAME OF EMPLOYEE :"+name);
		 System.out.println("AGE OF EMPLOYEE :"+age);
		 System.out.println("SALARY OF EMPLOYEE :"+salary);
	 }
	 void check()
	 {
		 if(salary>20000)
		 {
			 System.out.println("10% ADDED TO YOUR SALARY :"+((salary*10/100)+salary));
		 }
		 else
		 {
			 System.out.println("20% ADDED TO YOUR SALARY :"+((salary*20/100)+salary));
		 }
	 }

}
