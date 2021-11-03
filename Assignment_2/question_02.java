package Assignment_2;
import java.util.*;
public class question_02 
{
 public static void main (String args[])
 {
	 int i;
	 int n;
	 Scanner s=new Scanner (System.in);
	 System.out.println("Enter The Table Numbar Which You Want " );
	 n=s.nextInt();
	 for(i=1; i<=10; i++)
	 {
		 System.out.print(n*i+" ");
	 }
 }
}
