package Assignment_ExceptionHandling;

import java.util.Scanner;

public class question_07
{
	
	public static void main(String args[])
	{
		int internalmarks;
		int externalmarks;
	   Scanner s=new Scanner (System.in);
	   System.out.println("Enter Your Internal Marks :");
	   internalmarks=s.nextInt();
	   System.out.println("Enter Your External Marks :");
	   externalmarks=s.nextInt();
		try {
			if(internalmarks<40)
			{
				System.out.println("Your Internal Marks Is In Limit");
			}
			else
				throw new Exception();
			
			} catch (Exception e)
		    {
				System.out.println("Internal Marks is Exceed");	
		    }
		try {
			if(externalmarks<60)
			{
				System.out.println("Your External Marks Is In Limit");
			}
			else
				throw new Exception();
		   } catch(Exception e)
		   {
		 	System.out.println("External Marks Is Exceed");
		   }
		
		
	}

}
