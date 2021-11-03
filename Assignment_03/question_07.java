package Assignment_03;
import java.util.*;
public class question_07
{
public static void main(String args[])
{
	int a[]= {4,12,18,20,45,60};
	Scanner s=new Scanner (System.in);
	System.out.println("Enter Copy To Copy Above Array In Another");
	String copy=s.next();
	int b[]=new int [6];
	for(int i=0; i<6; i++)
	{
	   b[i]=a[i];	
	}
	System.out.print("b[]="+" "+"{");
	for(int i=0; i<6; i++)
	{
	System.out.print(b[i]+" ");
}
	System.out.print("}");
}
}