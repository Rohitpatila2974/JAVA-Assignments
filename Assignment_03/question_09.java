package Assignment_03;
import java.util.*;
public class question_09 
{
 public static void main(String args[])
 {
	 int a[]=new int [10];
	 Scanner s=new Scanner (System.in);
	 System.out.println("Enter The 10 Numbers");
	 for(int i=0; i<10; i++)
	 {
		  a[i]=s.nextInt();
	 }
	 System.out.print("a[]="+" "+"{");
	 for(int i=0; i<10; i++)
	 {
		 System.out.print(a[i]+" ");
	 }
	 System.out.print("}");
	 System.out.println();
	 System.out.println("Array Reverse Element");
	 System.out.print("a[]="+" "+"{");
	 for(int i=9; i>=0; i--)
	 {
		 System.out.print(a[i]+" ");
	 }
	 System.out.print("}");
 }
}
