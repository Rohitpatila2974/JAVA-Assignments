package Assignment_03;
import java.util.*;
public class question_14
{
public static void main(String args[])
{
	int a[]= {10,20,30,40,50,60};
	int size=a.length;
	int last=a[size-1];
	System.out.println("Input Array :");
	for(int i=0; i<6; i++)
	{
		System.out.print(a[i]+" ");
	}
	for(int i=size-1; i>0; i--)
	{
		a[i]=a[i-1];
	}
	System.out.println();
      a[0]=last;
      System.out.println("Output Array :");
	for(int i=0; i<6; i++)
	{
		System.out.print(a[i]+" ");
	}

}
}
