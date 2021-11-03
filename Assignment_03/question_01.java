package Assignment_03;
import java.util.*;
public class question_01 
{
 public static void main (String args[])
 {

	 int a[]=new int [5];
	 Scanner s=new Scanner (System.in);
	 System.out.println("Enter the Number");
	 for(int i=0; i<5; i++)
	 {
		a[i]=s.nextInt(); 
	 }
	 
	 for (int i=0; i<5; i++)
	 { 
		System.out.print(a[i]+" ");
	 } 
	 System.out.println();
	 int sum=0;
	 for(int i=0; i<5; i++)
	 {
		 sum=sum+a[i];
	 } 
	 System.out.println("The Sum of Five Numbers is ="+sum);
 }
}
