package Assignment_03;
import java.util.*;
public class question_08 
{
 public static void main(String args[])
 {
	 
	 Scanner s=new Scanner (System.in);
	 System.out.println("Enter The Size of Array");
	 int size=s.nextInt();
	 int a[]=new int [size];
	 System.out.println("Enter The Numbers");
	 
	 for(int i=0; i<size; i++)
	 {
		 a[i]=s.nextInt();
	 }
	 for(int i=0; i<size; i++)
	 {
		System.out.print(a[i]+" "); 
	 }
      
	 int max=a[0];
	 for(int i=1; i<size; i++)
	 {
		 if(a[i]>max)
		 {
			 max=a[i];
		 }
	 }
	 int min=a[0];
	 for(int i=1; i<size; i++)
	 {
		 if(a[i]<min)
		 {
			 min=a[i];
		 }
	 }
	 System.out.println();
	 System.out.println("The Maximum Number In Given Array Is ="+max);
	 System.out.println("The Minimum Number In Given Array Is ="+min);
	 
 }
}
