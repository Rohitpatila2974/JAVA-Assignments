package Assignment_ExceptionHandling;

public class question_06 
{
	
	
	public static void main(String args[])
	{
		try {
			int age=19;
			if(age>18)
			{
				System.out.println("Your are eligible to drive");
			}
			else
			{
				throw new Exception();
			}
				
		}catch(Exception e)
		{
			System.out.println("Your are not eligible to drive");
		}
		
		finally
		{
			System.out.println("1. whether exception raised or not finally block will always exicute");
		}
	}

}
