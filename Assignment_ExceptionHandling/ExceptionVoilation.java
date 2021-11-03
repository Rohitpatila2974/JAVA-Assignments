package Assignment_ExceptionHandling;

public class ExceptionVoilation 
{
	public static void main(String args[])
	{
    truck t=new truck();
    submarine s=new submarine();
    try {
    	if(t.set_speed()<t.set_Speed())
    	{
    		System.out.println("TRUCK SPEED :"+t.speed);
    	}
    	else
    	{
    		throw new Exception();
    	}
    } catch (Exception e)
    {
    	System.out.println("CHECK YOUR SPEED");
    }
    
    try {
    	if(s.speed<s.set_Speed())
    	{
    		System.out.println("SUBMARINE SPEED :"+s.speed);
    	}
    	else
    		throw new Exception();
    } catch (Exception e)
    {
    	System.out.println("CHECK YOUR SPEED");
    }
		
}
}
