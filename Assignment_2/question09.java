package Assignment_2;
import java.util.*;
public class question09 
{
 public static void main(String args[])
 {
	 int num,digit;
	 int sumeven=0;
	 int sumodd=0;
	 
	 Scanner s=new Scanner (System.in);
	 System.out.println("Enter The Number");
	 num=s.nextInt();
	 
	 while(num>0)
	 {
		 digit=num%10;
		 if(digit%2==0)
			 sumeven=sumeven+digit;
		 else
			 sumodd=sumodd+digit;
		 num=num/10;
			 
	 }
	 System.out.println("Sum of Even Digits = "+sumeven);
	 System.out.println("Sum of Odd Digits = "+sumodd);
	 
 }
}
