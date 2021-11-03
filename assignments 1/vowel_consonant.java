package DAY02;
import java.util.*;

public class vowel_consonant 
{
	public static void main(String args[])
	{
		char r;
		
	 Scanner s=new Scanner (System.in);
	 System.out.println("Enter the Character");
	 r=s.next().charAt(0);
	 
	 if(r=='a' || r=='e' || r=='i' || r=='o' || r=='u')
	 {
		 System.out.println("character is Vowel"); 
	 }
	 else
	 {
		 System.out.println("Character is Consonant");
	 }
	 
	}

}
