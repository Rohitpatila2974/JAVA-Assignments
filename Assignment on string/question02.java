package chapter_String;
import java.util.*;
public class question02 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter The String :");
		String string1=s.next();
		
		System.out.println("String 1 Is :"+string1);
		
		System.out.println("Enter The 2nd String which you want to concatinate :");
		String string2=s.next();
		
		System.out.println("String 2 Is :"+string2);
		
		System.out.println(string1+=string2);//method 1.
		
		
		System.out.println(string1.concat(string2));//method 2.
		
	}

}
