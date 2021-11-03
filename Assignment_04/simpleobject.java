package Assignment_04;
import java.util.*;
public class simpleobject 
{ String name;
  int rollno;
  long mobileno;
  String Department;
  
	
	simpleobject(String n, int r, long m, String a)
	{
		this.name=n;
		this.rollno=r;
		this.mobileno=m;
		this.Department=a;
	 	
	}
	void display()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Roll Number :"+this.rollno);
		System.out.println("Mobile Number :"+this.mobileno);
		System.out.println("Address :"+this.Department);
		
		
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter The Name & Roll Number :");
		String N=s.nextLine();
		int Roll=s.nextInt();
		System.out.println("Enter Mobile Number & Department :");
		long Mobile=s.nextLong();
		String Dep=s.next();
		simpleobject st=new simpleobject(N, Roll, Mobile, Dep);
		st.display();
			
	}
}
