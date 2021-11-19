package chapter_String;
import java.util.*;
public class question04
{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner (System.in);
		System.out.println("Enter The 1st String :");
		String string1=s.next();
		
		System.out.println("1st String is :"+string1);
		
		System.out.println("Enter The 2nd String :");
		String string2=s.next();
		
		System.out.println("2nd String is :"+string2);
		
		 int length=string1.compareToIgnoreCase(string2);
		
		if(length<0)
		{
			System.out.println("String1 Is Less Than String2");
		}
		else if(length > 0)
		{
			System.out.println("String1 Is Greater Than String2");
		}
		else
		{
			System.out.println("String1 Is Equal To String2");
		}
		
		
	}

}
