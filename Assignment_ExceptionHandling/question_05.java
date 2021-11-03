package Assignment_ExceptionHandling;

public class question_05 
{

	public static void main(String args[])
	{
		try {
	   if(args.length==2)
	   {
		   for(int i=0; i<args.length; i++)
		   System.out.println(args[i]);
	   }
	   else
		   throw new ArithmeticException();
		
	   } catch (ArithmeticException e)
		{
		   System.out.println("Problem In Array Length");
		}
	}
}
	