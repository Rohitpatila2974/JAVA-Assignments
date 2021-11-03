package Assignment_2;
import java.util.*;
public class question_04 
{
 public static void main(String args[])
 {
	 int x,y,z;
	 int n=1;
	 int i=1;
	 
	 Scanner s=new Scanner (System.in);
	 
	 do
	 {
		 System.out.print("Enter The 1st Number x =");
		 x=s.nextInt();
		 System.out.println();
		 System.out.print("Enter The 2nd Numabr y =");
		 y=s.nextInt();
		 System.out.println();
		 z=x+y;
		 System.out.println("Addition of two number is z ="+z);
		 
		 System.out.println("if you wish to continue the Addition press any integer number");
		 n=s.nextInt();
	 }while(i!=0);
			 
 }
}

