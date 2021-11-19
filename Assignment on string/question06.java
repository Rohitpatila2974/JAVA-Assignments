package chapter_String;
import java.util.*;
public class question06
{
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The String :");
		String string=s.nextLine();
	
		StringBuilder sb=new StringBuilder();
		String str[]=string.split(" ");
		
		for(int i=str.length-1; i>=0; i--)
		{
			sb.append(str [i]);
			sb.append(" ");
			
		}
		
		System.out.println(sb);
	
	}

}
