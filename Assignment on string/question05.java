package chapter_String;
import java.util.*;
public class question05
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter The 1st String :");
		String string1=s.next();
		
		System.out.println("1st String is :"+string1);
		
		System.out.println("Enter The 2nd String :");
		String string2=s.next();
		
		System.out.println("2nd String is :"+string2);
		
		if(string1.contains(string2)== true)
		{
			System.out.println("String1 & String2 Contains Same Data ");
		}
		else
		{
		System.out.println("String1 & String2 Not Contans Same Data ");	
		}
				
	}

}
