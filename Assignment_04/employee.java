package Assignment_04;
import java.util.*;
public class employee 
{String name;
 int salary;
int employeeId;

   void getdetails()
   {
	   Scanner s=new Scanner (System.in);
	   System.out.println("Enter Name Of Employee :");
	   this.name=s.nextLine();
	   System.out.println("Enter The Salary Of Employee :");
	   this.salary=s.nextInt();
	   System.out.println("Enter Employee ID");
	   this.employeeId=s.nextInt();
	   
   }
   void getdisplay()
   {
	   System.out.println("Employee Name :"+this.name);
	   System.out.println("Salary :"+this.salary);
	   System.out.println("Employee ID :"+this.employeeId);
   }
   
   void sort(employee e[])
   {employee temp=new employee();
   for(int i=0; i<5; i++)
   {
	   for(int j=0; j<6-1-i; j++)
	   {
		   if(e[j].employeeId>e[j+1].employeeId)
		   {
			   temp=e[j];
			   e[j]=e[j+1];
			   e[j+1]=temp;
			   
		   }
	   }
   }
	   
   }

 public static void main (String args[])
 {
	 System.out.println("Enter The Following Details Of Employee :");
	 employee[] e=new employee[6];
	 
	 for(int i=0; i<6; i++)
	 {
		 e[i]=new employee();
		 e[i].getdetails();
	 }
	 System.out.println("Employee Details :");
	 e[0].sort(e);
	 for(int i=0; i<6; i++)
	 {
		 e[i].getdisplay();
		 System.out.println();
	 }
	
	 
	 
 }
}
