package Assignment_03;
import java.util.*;
public class question_02 
{
public static void main(String args[])
{
	int flag=0;
	Scanner s=new Scanner (System.in);
	System.out.println("Enter The 7 Numbers");
	
	int a[]=new int [7];
	for(int i=0; i<7; i++)
	{
       a[i]=s.nextInt();	
	}
	for(int i=0; i<7; i++)
	{
	System.out.print(a[i]+" ");
	}
	System.out.println();
	int number;
	System.out.println("Enter The Number To Be Search");
	number=s.nextInt();
	
	for(int i=0; i<7; i++)
	{
	if(number==a[i])
	{
		flag=1;	 
		System.out.println("Number is Found");
        break;
	}
	}
	if(flag==0)
	{
		System.out.println("Number is Not Found");
	}
}
}