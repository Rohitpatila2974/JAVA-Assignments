package Assignment_03;
import java.util.*;
public class question_03 
{
public static void main(String args[])
{
	Scanner s=new Scanner (System.in);
	System.out.println("Enter The 5 Number");
	int a[]=new int[5];
	for(int i=0; i<5; i++)
	{
	  a[i]=s.nextInt();
	}
	
	for(int i=0; i<5; i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	int even=0;
	int odd=0;
	for(int i=0; i<5; i++)
	{
	if(a[i]%2==0)
	{
		even++;
	}
	else
	{
		odd++;
   }
	}
	System.out.println("Total Even Numbers ="+even);
	System.out.println("Total Odd Numbers ="+odd);
}
}
