package Assignment_2;
import java.util.*;
public class question_03
{
 public static void main (String args[])
 {
	 int number,r;
	 int sum=0;
	 
	 Scanner s=new Scanner (System.in);
	 System.out.println("Enter the number to be Reverse");
	 number=s.nextInt();
	 
	 while(number!=0)
	 {
		 r=number%10;
		 sum=(sum*10)+r;
		 number=number/10;
	 }
	 System.out.println("Reversed Number ="+sum);
 }
}
