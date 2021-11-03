package DAY02;
import java.util.*;

public class leap_year
{
 public static void main (String args[])
 {
	 int year;
	  Scanner s=new Scanner (System.in);
	  System.out.println("Enter The Year");
	  year=s.nextInt();
	  
	  if(year%4==0 && year%400==0)
	  {
		  System.out.println("Year Is Leap Year");
	  }
	  else
	  {
		  System.out.println("Year Is Not Leap Year");
	  }
 }
}
