package Assignment_ExceptionHandling;

public class Vehicle 
{
	
	int set_Speed()
	{
		int speed=200;
		return speed;
	}
}	

	class truck extends Vehicle
	{
		int speed=220;
		
		int set_speed()
		{		
		return speed;	
		}
		
		
	}
	
	class submarine extends Vehicle
	{
		int speed=50;
		int set_speed()
		{
			return speed;
		}	
		
	}
	


