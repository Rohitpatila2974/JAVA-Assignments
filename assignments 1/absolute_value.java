package DAY02;
import java.util.*;
public class absolute_value 
{
 public static void main (String args[])
 {
	 int x;
	 Scanner s=new Scanner (System.in);
	 System.out.println("Enter The Number");
	 x=s.nextInt();
	 
	 if(x<0)
	 {
		 System.out.println("output "+-1*x);
	 }
	 else
		 System.out.println("Output "+x);
 }
}
