package chapter_String;
import java.util.*;
public class question01 
{

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter The String :");
		String string=s.next();
		
		System.out.println("String is : "+string);
		
		System.out.println("enter the character which you want the index of that character :");
		char ch=s.next().charAt(0);
		
		System.out.println("Indext of Entered Character Is :"+string.indexOf(ch));
	}
}
