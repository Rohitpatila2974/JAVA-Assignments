
package Assignment_2;
import java.util.*;
public class question_06 
{
  public static void main (String args[])
  {
	  int a=0;
	  int b=1;
	  int i,c,n;
	  
	  Scanner s=new Scanner (System.in);
	  
	  System.out.println("Enter the number upto which fibonaccie series you want");
	  n=s.nextInt();
	  System.out.print(a+" ");
	  System.out.print(b+" ");
	  
	  for(i=1; i<=n; i++)
	  {
		  c=a+b;
		  System.out.print(c+" ");
		  a=b;
		  b=c;
		  
	  }
  }
}
