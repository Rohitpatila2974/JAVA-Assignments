package Assignment_03;
import java.util.*;
public class question_06
{
 public static void main(String args[])
 {
	 
	 Scanner s=new Scanner (System.in);
	 System.out.println("Enter The Size Of Array");
	 int size=s.nextInt();
	 System.out.println("Enter The Numbers");
	 int a[]=new int [size];
	 for(int i=0; i<size; i++)
	 {
		 a[i]=s.nextInt();
	 }
	 for(int i=0; i<size; i++)
	 {
		 System.out.print(a[i]+" ");
	 }
	
	 System.out.println();
	
	 System.out.println("Enter The Number To Find Their Index");
	 int number=s.nextInt();
	 int index=0;
	 for(int i=0; i<size; i++)
	 {
	   if(number==a[i])
	   {
		   index=i;
	   }
	 }
	 
	 System.out.println("index="+index);
 }
}
