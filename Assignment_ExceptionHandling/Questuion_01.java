package Assignment_ExceptionHandling;

public class Questuion_01 
{
	
	static
	{
		System.out.println("STATIC BLOCK 1. Static block is excuted at the time of .class file is loaded in JVM ");
	}
	
	public static void main(String args[])
	{
		System.out.println("ROHIT PATIL");	
	}
	static
	{
		System.out.println("STATIC BLOCK 2. static block is excuted only one time");
	}


}
