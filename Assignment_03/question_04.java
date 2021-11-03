package Assignment_03;
import java.util.*;
public class question_04 
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
		
		int Arry_even[]=new int [even];
		int Arry_odd[]=new int [odd];
		int k=0;
		int p=0;
		
		for(int i=0; i<5; i++)
		{
			if(a[i]%2==0)
			{
			Arry_even[k]=a[i];
			k++;
		    }
			else			
		    {
			Arry_odd[p]=a[i];
			p++;
		    }
		}
		System.out.println("Even Numbers Arry is :");
		System.out.print("{");
		for(k=0; k<even; k++)
		{
		System.out.print(Arry_even[k]+",");
		}
		System.out.println("}");
		System.out.println("Odd Numbers Arry is :");
		System.out.print("{");
		for(p=0; p<odd; p++)
		{
		System.out.print(Arry_odd[p]+",");
		}
		System.out.print("}"); 
}
}